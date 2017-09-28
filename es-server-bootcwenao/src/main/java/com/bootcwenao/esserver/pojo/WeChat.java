/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.bootcwenao.esserver.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * https://github.com/elastic/elasticsearch
 * <pre>
 *     curl -XPUT 'http://localhost:9200/twitter/doc/1?pretty' -H 'Content-Type: application/json' -d '
 {
 "user": "kimchy",
 "post_date": "2009-11-15T13:12:00",
 "message": "Trying out Elasticsearch, so far so good?"
 }'

 curl -XPUT 'http://localhost:9200/twitter/doc/2?pretty' -H 'Content-Type: application/json' -d '
 {
 "user": "kimchy",
 "post_date": "2009-11-15T14:12:12",
 "message": "Another tweet, will it be indexed?"
 }'

 curl -XPUT 'http://localhost:9200/twitter/doc/3?pretty' -H 'Content-Type: application/json' -d '
 {
 "user": "elastic",
 "post_date": "2010-01-15T01:46:38",
 "message": "Building the site, should be kewl"
 }'
 * </pre>
 * 官方代码样例数据<p/> elasticsearch-2.3.4 作为服务端
 * 用firefox 插件restClient put 数据，http header要设置 Content-Type: application/json
 */
@Document(indexName = "twitter",type = "doc", shards = 1,replicas = 0, refreshInterval = "-1")
public class WeChat {

    @Id
    private String id;
    @Field
    private String user;
    @Field
    private String post_date;
    @Field
    private String message;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */

    public String getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

