package desafio.dominio;

public class Curso extends Conteudo{
    
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    @Override
    public double calcularXP() {
        return XP_Padrao * cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

}