package todoproject.todolist.todo;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepositury extends JpaRepository<Todo, Integer> {
    public List<Todo> findByUsername(String username);
}
