package com.github.lmj.security.auth.mapper;

import com.github.lmj.security.auth.entity.ClientService;
import tk.mybatis.mapper.common.Mapper;

public interface ClientServiceMapper extends Mapper<ClientService> {
    void deleteByServiceId(int id);
}