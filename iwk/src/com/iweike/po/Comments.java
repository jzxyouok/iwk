package com.iweike.po;


// default package



/**
 * Comments entity. @author MyEclipse Persistence Tools
 */

public class Comments {


    // Fields    

	private int id;// 编号
	private String time;// 评论时间
	private String contents;// 评论内容
	private String author;// 评论人

	private Integer objId;
	private Integer videoId;// 视频编号


    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObjId() {
        return this.objId;
    }
    
    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }

    public String getContents() {
        return this.contents;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getVideoId() {
        return this.videoId;
    }
    
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }
   








}