package com.iwk.yang.tool;

import android.os.SystemClock;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class DoubleClick {
    /**
     * 双击事件、多击事件
     */
    //存储时间的数组
    static long[] mHits = new long[2];
    public static boolean doubleClick() {

        // 双击事件响应
        /**
         * arraycopy,拷贝数组
         * src 要拷贝的源数组
         * srcPos 源数组开始拷贝的下标位置
         * dst 目标数组
         * dstPos 开始存放的下标位置
         * length 要拷贝的长度（元素的个数）
         *
         */
        //实现数组的移位操作，点击一次，左移一位，末尾补上当前开机时间（cpu的时间）
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        mHits[mHits.length - 1] = SystemClock.uptimeMillis();
        //双击事件的时间间隔500ms
        if (mHits[0] >= (SystemClock.uptimeMillis() - 500)) {
            //双击后具体的操作
            return true;
        }else{
            return false;
        }
    }
}
