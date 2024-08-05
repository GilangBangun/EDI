package com.example.edi.model;

import java.io.Serializable;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class TrainingExperienceModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String namaKursus;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private Integer keberadaanSertifikat;

    @NotNull
    @Size(max = 10)
    @Column(nullable = false)
    private Integer tahun;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_biodata")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private BiodataModel biodataModel;
}
