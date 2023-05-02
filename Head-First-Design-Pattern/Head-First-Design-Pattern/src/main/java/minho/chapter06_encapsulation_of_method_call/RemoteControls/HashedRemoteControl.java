package minho.chapter06_encapsulation_of_method_call.RemoteControls;

import minho.chapter06_encapsulation_of_method_call.EquipCommands.Command;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class HashedRemoteControl {
    HashMap<String, Command> onSlotMap;
    HashMap<String, Command> offSlotMap;

    Stack<Command> undos;

    public HashedRemoteControl(){
        this.onSlotMap = new HashMap<>();
        this.offSlotMap = new HashMap<>();
        this.undos = new Stack<>();
    }

    public void setCommand(String token, Command onCommand, Command offCommand){
        onSlotMap.put(token, onCommand);
        offSlotMap.put(token, offCommand);
    }

    public void onButtonWasPushed(String token){
        if(onSlotMap.containsKey(token)){
            Command curCommand = onSlotMap.get(token);
            curCommand.execute();
            undos.push(curCommand);
        } else{
            System.out.println(token + "에 해당하는 버튼이 없습니다.");
        }
    }

    public void offButtonWasPushed(String token) {
        if(offSlotMap.containsKey(token)){
            Command curCommand = offSlotMap.get(token);
            curCommand.execute();
            undos.push(curCommand);
        } else{
            System.out.println(token + "에 해당하는 버튼이 없습니다.");
        }
    }

    public void undoButtonWasPushed(){
        if(!undos.isEmpty()){
            Command undoCommand = undos.pop();
            undoCommand.undo();
        }else{
            System.out.println("더이상 이전 정보가 없습니다.");
        }
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n--------- 리모컨 ---------\n");
        Set tokens = onSlotMap.keySet();
        for(Object token : tokens){
            String tokenStr = token.toString();
            stringBuffer.append("[slot "+token+ "] "
                    + onSlotMap.get(tokenStr).getClass().getName() + "\t"
                    + offSlotMap.get(tokenStr).getClass().getName());
        }

        return stringBuffer.toString();
    }
}
