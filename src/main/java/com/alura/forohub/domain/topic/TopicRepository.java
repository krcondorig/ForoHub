package com.alura.forohub.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNullApi;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    boolean existsByTitle(String title);

    boolean existsByMessage(String message);

    @Query("SELECT t FROM Topic t WHERE t.status != 'ELIMINADO'")
    Page<Topic> findAll(Pageable page);

    @Query("SELECT t FROM Topic t WHERE t.status != 'ELIMINADO' AND t.id=:id")
    Optional<Topic> findId(Long id);
}
