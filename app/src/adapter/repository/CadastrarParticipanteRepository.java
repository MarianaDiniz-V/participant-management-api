package adapter.repository;

import domain.Participante;

public interface CadastrarParticipanteRepository extends JpaRepository<Participante, Long> {
    void save (Participante participante);
}
