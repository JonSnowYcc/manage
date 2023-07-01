package com.zuzu.sys.service.impl;

import com.zuzu.sys.entity.Vote;
import com.zuzu.sys.mapper.VoteMapper;
import com.zuzu.sys.service.IVoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lili
 * @since 2023-06-27
 */
@Service
public class VoteServiceImpl extends ServiceImpl<VoteMapper, Vote> implements IVoteService {

}
