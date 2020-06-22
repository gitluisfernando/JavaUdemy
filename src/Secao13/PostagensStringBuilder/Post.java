package Secao13.PostagensStringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date dataHoraPostagem;
    private String tituloPostagem;
    private String conteudoPostagem;
    private int qtdCurtidas;

    private List<Comentario> comentarios = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Post() {

    }

    public Post(Date dataHoraPostagem, String tituloPostagem, String conteudoPostagem, int qtdCurtidas) {
        this.dataHoraPostagem = dataHoraPostagem;
        this.tituloPostagem = tituloPostagem;
        this.conteudoPostagem = conteudoPostagem;
        this.qtdCurtidas = qtdCurtidas;
    }

    public Date getDataHoraPostagem() {
        return dataHoraPostagem;
    }

    public void setDataHoraPostagem(Date dataHoraPostagem) {
        this.dataHoraPostagem = dataHoraPostagem;
    }

    public String getTituloPostagem() {
        return tituloPostagem;
    }

    public void setTituloPostagem(String tituloPostagem) {
        this.tituloPostagem = tituloPostagem;
    }

    public String getConteudoPostagem() {
        return conteudoPostagem;
    }

    public void setConteudoPostagem(String conteudoPostagem) {
        this.conteudoPostagem = conteudoPostagem;
    }

    public List<Comentario> getComentario() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tituloPostagem + "\n");
        stringBuilder.append(qtdCurtidas);
        stringBuilder.append(" Curtidas - ");
        stringBuilder.append(sdf.format(dataHoraPostagem) + "\n");
        stringBuilder.append(conteudoPostagem + "\n");
        stringBuilder.append("Comentários:\n");
        for (Comentario comentario : comentarios) {
            stringBuilder.append(comentario.getTextoComentario() + "\n");
        }
        return stringBuilder.toString();
    }

}