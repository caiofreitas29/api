package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastrMedico(String nome, String email, String crm, Especialidade especialidade,
                                 DadosEndereco endereco) {
}
