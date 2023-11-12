package com.javalearning.other;

public class LongTest {

    Long thirdPartyAdserverInstanceId;

    public void setInstance(Long thirdPartyAdserverInstanceId){

        if(null!= thirdPartyAdserverInstanceId && thirdPartyAdserverInstanceId == 0L){
            this.thirdPartyAdserverInstanceId = null;
        }else {
            this.thirdPartyAdserverInstanceId = thirdPartyAdserverInstanceId;
        }
    }
    public static void main(String[] args) {
        LongTest longTest = new LongTest();
        longTest.setInstance(1L);
        System.out.println(longTest.thirdPartyAdserverInstanceId);
    }
}
