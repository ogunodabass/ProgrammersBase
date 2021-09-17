/* Created by Adam Jost on 09/13/2021 */
package com.pb.ProgrammersBase.resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

    Page<Resource> findByCategoryCode(Long categoryCode, Pageable pageable);

    List<Resource> findByCategoryCodeAndTitleContainingIgnoreCaseOrCategoryCodeAndDescContainingIgnoreCase
            (
                    @Param("categoryCode") Long categoryCode1,
                    @Param("keyword") String keyword1,
                    @Param("categoryCode") Long categoryCode2,
                    @Param("keyword") String keyword2
            );
}
