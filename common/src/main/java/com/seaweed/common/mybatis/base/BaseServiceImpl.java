package com.seaweed.common.mybatis.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @param <M>
 * @param <T>
 * @author lyk
 * service基础实现类
 */
@NoArgsConstructor
public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements BaseService<T> {

    @Override
    public boolean save(T domain) {
        Date now = new Date();
        domain.setCreateDate(now);
        domain.setUpdateDate(now);
        return super.save(domain);
    }

    @Override
    public boolean updateById(T entity) {
        return super.updateById(entity);
    }
}
