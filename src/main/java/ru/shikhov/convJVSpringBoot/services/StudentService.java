package ru.shikhov.convJVSpringBoot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.shikhov.convJVSpringBoot.entities.Student;
import ru.shikhov.convJVSpringBoot.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findStudentById(id);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public void createStudent(Student student) {
        studentRepository.save(student);
    }
}
