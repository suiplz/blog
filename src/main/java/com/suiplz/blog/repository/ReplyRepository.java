package com.suiplz.blog.repository;

import com.suiplz.blog.dto.ReplySaveRequestDto;
import com.suiplz.blog.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReplyRepository extends JpaRepository<Reply,Integer>{

    @Query(value="INSERT INTO reply(userId, boardId, content, createDate) VALUES(?1,?2,?3,now())", nativeQuery = true)
    void mSave(ReplySaveRequestDto replySaveRequestDto);

}
