package com.hiasenna.xunfei;

import java.util.Scanner;

/**
 * @ClassName C
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2020/7/31-14:32
 * @Version 1.0
 **/
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ax = 0;
        int ay = 0;
        int bx = 0;
        int by = 0;
        int cx = 0;
        int cy = 0;
        int dx = 0;
        int dy = 0;
        ax = in.nextInt();
        ay = in.nextInt();
        bx = in.nextInt();
        by = in.nextInt();
        cx = in.nextInt();
        cy = in.nextInt();
        dx = in.nextInt();
        dy = in.nextInt();

//        if (cy > by && cy < dy && by > ay) System.out.println(0);
//        else if (cx > bx && cx < dx && bx > ax) System.out.println(0);
//        else if (cx > ax && cx < bx && dy > ay && dy < by && by > ay) System.out.println(0);
//        else if (ax > cx && ax < dx && by > cy && by < dy) System.out.println(0);
//        else System.out.println(1);
        //十六總情況
        if (ax < bx && ay < by) {
            if (cx < dx && cy < dy) {
                if (cx > ax && dx < bx && cy > ay && dy < by) System.out.println(0);
                else if (cx < ax && dy > by && cy < ay && dx > bx) System.out.println(0);
                else if (cx > bx) System.out.println(0);
                else if (dx < ax) System.out.println(0);
                else if (cy > by) System.out.println(0);
                else if (dy < ay) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy > dy) {
                if (dx > ax && cx < bx && dy > ay && cy < by) System.out.println(0);
                else if (dx < ax && cy > by && dy < ay && cx > bx) System.out.println(0);
                else if (dx > bx) System.out.println(0);
                else if (cx < ax) System.out.println(0);
                else if (dy > by) System.out.println(0);
                else if (cy < ay) System.out.println(0);
                else System.out.println(1);

            } else if (cx < dx && cy > dy) {
                if (cx > ax && dx < bx && dy > ay && cy < by) System.out.println(0);
                else if (cx < ax && cy > by && dy < ay && dx > bx) System.out.println(0);
                else if (cx > bx) System.out.println(0);
                else if (dx < ax) System.out.println(0);
                else if (dy > by) System.out.println(0);
                else if (cy < ay) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy < dy) {
                if (dx > ax && cx < bx && cy > ay && dy < by) System.out.println(0);
                else if (dx < ax && dy > by && cy < ay && cx > bx) System.out.println(0);
                else if (dx > bx) System.out.println(0);
                else if (cx < ax) System.out.println(0);
                else if (cy > by) System.out.println(0);
                else if (dy < ay) System.out.println(0);
                else System.out.println(1);
            }
        } else if (ax > bx && ay > by) {
            if (cx < dx && cy < dy) {
                if (cx > bx && dy < ay && by < cy && dx < ax) System.out.println(0);
                else if (cx < bx && dy > ay && cy < by && dx > ax) System.out.println(0);
                else if (cx > ax) System.out.println(0);
                else if (dx < bx) System.out.println(0);
                else if (cy > ay) System.out.println(0);
                else if (dy < by) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy > dy) {
                if (dx > bx && cy < ay && by < dy && cx < ax) System.out.println(0);
                else if (dx < bx && cy > ay && dy < by && cx > ax) System.out.println(0);
                else if (dx > ax) System.out.println(0);
                else if (cx < bx) System.out.println(0);
                else if (dy > ay) System.out.println(0);
                else if (cy < by) System.out.println(0);
                else System.out.println(1);
            } else if (cx < dx && cy > dy) {
                if (cx > bx && cy < ay && by < dy && dx < ax) System.out.println(0);
                else if (cx < bx && cy > ay && dy < by && dx > ax) System.out.println(0);
                else if (cx > ax) System.out.println(0);
                else if (dx < bx) System.out.println(0);
                else if (dy > ay) System.out.println(0);
                else if (cy < by) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy < dy) {
                if (dx > bx && dy < ay && by < cy && cx < ax) System.out.println(0);
                else if (dx < bx && dy > ay && cy < by && cx > ax) System.out.println(0);
                else if (dx > ax) System.out.println(0);
                else if (cx < bx) System.out.println(0);
                else if (cy > ay) System.out.println(0);
                else if (dy < by) System.out.println(0);
                else System.out.println(1);
            }
        } else if (ax < bx && ay > by) {
            if (cx < dx && cy < dy) {
                if (cx > ax && dy < ay && cy > by && dx < bx) System.out.println(0);
                else if (cx < ax && dy > ay && cy < by && bx < dx) System.out.println(0);
                else if (cx > bx) System.out.println(0);
                else if (dx < ax) System.out.println(0);
                else if (cy > ay) System.out.println(0);
                else if (dy < by) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy > dy) {
                if (dx > ax && cy < ay && dy > by && cx < bx) System.out.println(0);
                else if (dx < ax && cy > ay && dy < by && bx < cx) System.out.println(0);
                else if (dx > bx) System.out.println(0);
                else if (cx < ax) System.out.println(0);
                else if (dy > ay) System.out.println(0);
                else if (cy < by) System.out.println(0);
                else System.out.println(1);
            } else if (cx < dx && cy > dy) {
                if (cx > ax && cy < ay && dy > by && dx < bx) System.out.println(0);
                else if (cx < ax && cy > ay && dy < by && bx < dx) System.out.println(0);
                else if (cx > bx) System.out.println(0);
                else if (dx < ax) System.out.println(0);
                else if (dy > ay) System.out.println(0);
                else if (cy < by) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy < dy) {
                if (dx > ax && dy < ay && cy > by && cx < bx) System.out.println(0);
                else if (dx < ax && dy > ay && cy < by && bx < cx) System.out.println(0);
                else if (dx > bx) System.out.println(0);
                else if (cx < ax) System.out.println(0);
                else if (cy > ay) System.out.println(0);
                else if (dy < by) System.out.println(0);
                else System.out.println(1);
            }
        } else if (ax > bx && ay < by) {
            if (cx < dx && cy < dy) {
                if (cx > bx && dy < by && cy > ay && dx < ax) System.out.println(0);
                else if (cx < bx && dy > by && ay > cy && ax < dx) System.out.println(0);
                else if (cx > ax) System.out.println(0);
                else if (dx < bx) System.out.println(0);
                else if (cy > by) System.out.println(0);
                else if (dy < ay) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy > dy) {
                if (dx > bx && cy < by && dy > ay && cx < ax) System.out.println(0);
                else if (dx < bx && cy > by && ay > dy && ax < cx) System.out.println(0);
                else if (dx > ax) System.out.println(0);
                else if (cx < bx) System.out.println(0);
                else if (dy > by) System.out.println(0);
                else if (cy < ay) System.out.println(0);
                else System.out.println(1);
            } else if (cx < dx && cy > dy) {
                if (cx > bx && cy < by && dy > ay && dx < ax) System.out.println(0);
                else if (cx < bx && cy > by && ay > dy && ax < dx) System.out.println(0);
                else if (cx > ax) System.out.println(0);
                else if (dx < bx) System.out.println(0);
                else if (dy > by) System.out.println(0);
                else if (cy < ay) System.out.println(0);
                else System.out.println(1);
            } else if (cx > dx && cy < dy) {
                if (dx > bx && dy < by && cy > ay && cx < ax) System.out.println(0);
                else if (dx < bx && dy > by && ay > cy && ax < cx) System.out.println(0);
                else if (dx > ax) System.out.println(0);
                else if (cx < bx) System.out.println(0);
                else if (cy > by) System.out.println(0);
                else if (dy < ay) System.out.println(0);
                else System.out.println(1);
            }
        }

    }
}
