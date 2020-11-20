package com.company;

public class Main {

    public static void main(String[] args) {
        MAN[] headquarters = new MAN[9];

        headquarters[0] = new GENERAL(21, "Bob", true, 2);

        headquarters[1] = new COMMANDER(21, "Max1", false, (GENERAL)headquarters[0],3);
        headquarters[2] = new COMMANDER(21, "Max2", true, (GENERAL)headquarters[0],3);

        headquarters[3] = new SOLDIER(21, "Jack1", true, (COMMANDER) headquarters[1]);
        headquarters[4] = new SOLDIER(21, "Jack2", true, (COMMANDER) headquarters[2]);
        headquarters[5] = new SOLDIER(21, "Jack3", true, (COMMANDER) headquarters[1]);
        headquarters[6] = new SOLDIER(21, "Jack4", false, (COMMANDER) headquarters[2]);
        headquarters[7] = new SOLDIER(21, "Jack5", false, (COMMANDER) headquarters[1]);
        headquarters[8] = new SOLDIER(21, "Jack6", true, (COMMANDER) headquarters[2]);

        for(int i =0; i!=headquarters.length;i++)
        {

            System.out.println("ToFight person "+ (i+1)+": ");
            try {
                headquarters[i].toFight();
            } catch (ToFightException e) {
                System.out.println(e.getMessage());
            }
        }

        for(int i =0; i!=headquarters.length;i++)
        {
            System.out.println("ToReport person "+ (i+1)+": ");
            try {
                headquarters[i].toReport();
            } catch (ToReportException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }

    }

}
