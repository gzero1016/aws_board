package com.korit.board.entity;

import com.korit.board.dto.BoardCategoryRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardCategory {
    private int boardCategoryId;
    private String boardCategoryName;

    public BoardCategoryRespDto toCategoryDto() {
        return BoardCategoryRespDto.builder()
                .boardCategoryId(boardCategoryId)
                .boardCategoryName(boardCategoryName)
                .build();
    }
}
