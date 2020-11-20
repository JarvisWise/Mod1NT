package com.company;

public class SOLDIER extends MAN {
    private COMMANDER myCommander;
    private boolean canFight;


    public SOLDIER(int age, String name, boolean canFight, COMMANDER myCommander){
        super(age, name);
        this.canFight = canFight;
        this.myCommander = myCommander;
    }

    public void setMyCommander(COMMANDER myCommander) {
        this.myCommander = myCommander;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    @Override
    public void toFight() throws ToFightException {
        if(myCommander == null)
            throw new ToFightException("Cannot fight without commander");

        if(canFight) {
            System.out.println("Can fight");
        } else {
            System.out.println("Cannot fight");
        }
    }

    @Override
    public void toReport() throws ToReportException {
        if(myCommander == null)
            throw new ToReportException("Cannot report without commander");

        System.out.print("My commander: "+ myCommander.toString());
    }
}
