package mk.ukim.finki.wp.wp_lab.service.impl;

import mk.ukim.finki.wp.wp_lab.model.Teacher;
import mk.ukim.finki.wp.wp_lab.repository.TeacherRepository;
import mk.ukim.finki.wp.wp_lab.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return teacherRepository.findById(id);
    }
}
