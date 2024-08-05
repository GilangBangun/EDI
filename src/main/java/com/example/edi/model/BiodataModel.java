package com.example.edi.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class BiodataModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_biodata") 
    private Long id;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String posisi;

    @NotNull
    @Column(nullable = false)
    private Integer ktp;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String ttl;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String kelamin;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String agama;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String darah;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String status;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String alamatKtp;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String alamatTinggal;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private Integer telepon;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private String kontakDarurat;

    @NotNull
    @Size(max = 300)
    @Column(nullable = false)
    private String skill;

    @NotNull
    @Size(max = 50)
    @Column(nullable = false)
    private Integer harapanGaji;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private UserModel userModel;
    
}
