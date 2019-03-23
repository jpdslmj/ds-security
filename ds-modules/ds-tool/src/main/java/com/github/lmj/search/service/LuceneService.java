package com.github.lmj.search.service;


import com.github.lmj.security.api.vo.search.IndexObject;
import com.github.lmj.security.common.msg.TableResultResponse;

/**
 * lucense 接口
 */
public interface LuceneService {

    void save(IndexObject indexObject);

    void update(IndexObject indexObject);

    void delete(IndexObject indexObject);

    void deleteAll();

    TableResultResponse page(Integer pageNumber, Integer pageSize, String keyword);
}
