/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/15/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.behavioral.observer;

public class Youtube {
    public static void main(String[] args) {
        Chanel bappimazumderCh = new Chanel();
        Subscriber s1 = new Subscriber("Akash");
        Subscriber s2= new Subscriber("Monir");
        Subscriber s3 = new Subscriber("Bipul");
        Subscriber s4 = new Subscriber("Julien");

        bappimazumderCh.subscribe(s1);
        bappimazumderCh.subscribe(s2);
        bappimazumderCh.subscribe(s3);
        bappimazumderCh.subscribe(s4);
        s1.setSubscriberChannel(bappimazumderCh);
        s2.setSubscriberChannel(bappimazumderCh);
        s3.setSubscriberChannel(bappimazumderCh);
        s4.setSubscriberChannel(bappimazumderCh);

        bappimazumderCh.uploadVideo("New Video Uploaded");

    }
}
