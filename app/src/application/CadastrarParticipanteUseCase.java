package application;

import domain.DTO.CadastroParticipanteRequest;

public interface CadastrarParticipanteUseCase {
    void execute(CadastroParticipanteRequest request);
}
