package com.intelliviz.petclinic.services.springdatajpa;

import com.intelliviz.petclinic.model.Speciality;
import com.intelliviz.petclinic.repositories.SpecialityRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialityRepository specialityRepository;

    @InjectMocks
    SpecialitySDJpaService service;

    @Test
    void testDeleteByObject() {
        Speciality speciality = new Speciality();
        service.delete(speciality);
        verify(specialityRepository).delete(any(Speciality.class));
    }

    @Test
    void delete() {
        service.delete(new Speciality());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);
        service.deleteById(1L);
        verify(specialityRepository, times(2)).deleteById(1l);

        service.deleteById(2L);
        verify(specialityRepository).deleteById(2l);
    }

    @Test
    void findByIdTest() {
        Speciality speciality = new Speciality();
        when(specialityRepository.findById(1L)).thenReturn(Optional.of(speciality));
        Speciality foundSpeciality = service.findById(1L);
        assertNotNull(foundSpeciality);
        assertThat(foundSpeciality).isNotNull(); // AssertJ
        verify(specialityRepository).findById(1L);
        verify(specialityRepository).findById(anyLong());
    }
}