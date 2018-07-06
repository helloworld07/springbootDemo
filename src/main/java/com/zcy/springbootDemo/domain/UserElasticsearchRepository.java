package com.zcy.springbootDemo.domain;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by zcy on 2018/7/6.
 */
public interface UserElasticsearchRepository  extends ElasticsearchRepository<User, Long> {
}
