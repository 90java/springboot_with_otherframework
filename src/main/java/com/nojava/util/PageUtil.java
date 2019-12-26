package com.nojava.util;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: nojava
 * Date: 2019-07-28
 * Time: 14:58
 */
public class PageUtil<T> {

    // 具体业务数据。
    private T data;

    private int count;

    private int pagesize;

    private int size;

    public PageUtil(T data, int count, int size) {
        this.data = data;
        this.count = count;
        this.size = size;
        this.pagesize=0;
        if(count%size==0){
            this.pagesize=count/size;
        }else{
            this.pagesize=count/size+1;
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
