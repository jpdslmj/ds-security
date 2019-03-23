package com.github.lmj.security.admin.biz;

import com.github.lmj.security.admin.entity.GroupType;
import org.springframework.stereotype.Service;

import com.github.lmj.security.admin.mapper.GroupTypeMapper;
import com.github.lmj.security.common.biz.BaseBiz;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper, GroupType> {
}
