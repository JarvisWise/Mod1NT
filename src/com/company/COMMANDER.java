package com.company;

public class COMMANDER extends MAN {
    private GENERAL myGeneral;
    private int mySoldiers;
    private boolean canFight;


    public COMMANDER(int age, String name, boolean canFight, GENERAL myGeneral, int soldiers){
        super(age, name);
        this.canFight = canFight;
        this.myGeneral = myGeneral;
        this.mySoldiers = soldiers;
    }

    @Override
    public void toFight() throws ToFightException {
        if(mySoldiers == 0) {
            throw new ToFightException("Cannot fight without soldiers");
        } else if(myGeneral == null)
            throw new ToFightException("Cannot fight without general");

        if(canFight) {
            System.out.println("Can fight");
        } else {
            System.out.println("Cannot fight");
        }
    }

    @Override
    public void toReport() throws ToReportException {
        if(mySoldiers == 0) {
            throw new ToReportException("Cannot report without soldiers");
        } else if(myGeneral == null)
            throw new ToReportException("Cannot report without general");

        System.out.print("My commander: "+myGeneral.toString());
    }
}
