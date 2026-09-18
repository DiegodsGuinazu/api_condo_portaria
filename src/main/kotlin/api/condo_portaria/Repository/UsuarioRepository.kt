package api.condo_portaria.Repository

import api.condo_portaria.Entity.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository : JpaRepository<Usuario, Long>{
}