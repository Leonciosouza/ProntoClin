package com.application.SpringProntoClin.DTO;

import com.application.SpringProntoClin.domain.Consulta;

import java.util.Date;

public record ConsultaResponseDTO(Long idConsulta, Long idPaciente, Long idProfissionalSaude, String nomeProfissionalSaude, String nomePaciente, String nomeSocial ,Date dataConsulta, String especialidadeMedica) {

    public ConsultaResponseDTO(Consulta consulta) {
        this(consulta.getIdconsulta(), consulta.getIdpaciente(), consulta.getIdprofissionalsaude(), consulta.getNomeprossionalsaude(),consulta.getNomepaciente(), consulta.getNomesocial() ,consulta.getDataconsulta(), consulta.getEspecialidademedica());
    }
}
