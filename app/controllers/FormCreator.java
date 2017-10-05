package controllers;

import play.data.FormFactory;
import play.data.format.Formatters;
import play.i18n.MessagesApi;

/**
 * Created by danielgoncalvesti on 19/05/17.
 */
public class FormCreator {

    MessagesApi msgAPI;
    Formatters formatador;
    Validador validador;
    FormFactory factory;

    public FormCreator() {
        msgAPI = new MessagesApi(null);
        formatador = new Formatters(msgAPI);
        validador = new Validador();
        factory = new FormFactory(msgAPI, formatador, validador);
    }

    // getters e setters
    public MessagesApi getmsgAPI() {
        return msgAPI;
    }
    public void setmsgAPI(MessagesApi msgAPI) {
        this.msgAPI = msgAPI;
    }
    public Formatters getFormatador() {
        return formatador;
    }
    public void setFormatador(Formatters formatador) {
        this.formatador = formatador;
    }
    public Validador getValidador() {
        return validador;
    }
    public void setValidador(Validador validador) {
        this.validador = validador;
    }
    public FormFactory getFactory() {
        return factory;
    }
    public void setFactory(FormFactory factory) {
        this.factory = factory;
    }
}