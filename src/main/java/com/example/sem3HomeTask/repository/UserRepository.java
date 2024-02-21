package com.example.sem3HomeTask.repository;

import com.example.sem3HomeTask.domain.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторий работы с БД
 */
@Component
@Data
public class UserRepository {

    /**
     * Создание нового списка пользователей
     */
    private List<User> users = new ArrayList<>();

}
