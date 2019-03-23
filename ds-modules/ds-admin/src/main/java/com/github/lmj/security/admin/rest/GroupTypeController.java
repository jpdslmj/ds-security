package com.github.lmj.security.admin.rest;

import com.github.lmj.security.admin.biz.GroupTypeBiz;
import com.github.lmj.security.admin.entity.GroupType;
import com.github.lmj.security.common.msg.TableResultResponse;
import com.github.lmj.security.common.rest.BaseController;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;


@Controller
@RequestMapping("groupType")
public class GroupTypeController extends BaseController<GroupTypeBiz, GroupType> {

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Object> page(@RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "1")int page, String name){
        Example example = new Example(GroupType.class);
        if(StringUtils.isNotBlank(name)) {
            example.createCriteria().andLike("name", "%" + name + "%");
        }
        Page<Object> result = PageHelper.startPage(page, limit);
        baseBiz.selectByExample(example);
        return new TableResultResponse<Object>(result.getTotal(),result.getResult());
    }

}
