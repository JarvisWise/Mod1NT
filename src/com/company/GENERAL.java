package com.company;

public class GENERAL extends MAN {
    private int myCommanders;
    private boolean canFight;

    public GENERAL(int age, String name, boolean canFight, int myCommanders){
        super(age, name);
        this.canFight = canFight;
        this.myCommanders = myCommanders;
    }

    @Override
    public void toFight() throws ToFightException {
        if(myCommanders == 0)
            throw new ToFightException("Cannot fight without commanders");

        if(canFight) {
            System.out.println("Can fight");
        } else {
            System.out.println("Cannot fight");
        }
    }

    @Override
    public void toReport() throws ToReportException {
        if(myCommanders == 0)
            throw new ToReportException("Cannot report without commanders");

        System.out.print("I am general :"+toString());
    }
}
