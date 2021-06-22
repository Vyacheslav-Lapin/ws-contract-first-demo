package ru.vlapin.demo.wscontractfirstdemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.demo.wscontractfirstdemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
