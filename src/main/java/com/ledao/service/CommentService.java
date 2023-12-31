package com.ledao.service;

import com.ledao.entity.Comment;

import java.util.List;
import java.util.Map;

/**
 * 客户商品评论Service接口
 *
 * Created by XinChen
 * @company
 * @create 2020-05-27 22:35
 */
public interface CommentService {

    /**
     * 条件查询客户商品评论
     *
     * @param map
     * @return
     */
    List<Comment> list(Map<String, Object> map);

    /**
     * 获取记录数
     *
     * @param map
     * @return
     */
    Long getCount(Map<String, Object> map);

    /**
     * 添加客户商品评论
     *
     * @param comment
     * @return
     */
    Integer add(Comment comment);

    /**
     * 删除评论
     *
     * @param id
     * @return
     */
    Integer delete(Integer id);

    /**
     * 根据id查找实体
     *
     * @param id
     * @return
     */
    Comment findById(Integer id);
}
