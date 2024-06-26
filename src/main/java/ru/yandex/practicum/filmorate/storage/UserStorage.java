package ru.yandex.practicum.filmorate.storage;

import ru.yandex.practicum.filmorate.model.User;

import java.util.Collection;

public interface UserStorage {
    Collection<User> getAllUsers();

    User getUserById(Long id);

    void addNewUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    Collection<User> getFriends(long userId);

    User addFriend(long userId, long friendId);

    User deleteFriend(long userId, long friendId);

    Collection<User> getCommonFriends(long userId, long friendId);

}
