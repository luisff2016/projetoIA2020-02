/**
 * This package provides useful controller classes vor the visualization of system states in simulation applications.
 * Each controller class provides a constructor which accepts a root node (either a BorderPane or a Canvas).
 * The constructor adds elements to the node which will be used to visualize the system state. Updates and interactions
 * are handled by the controller. Some controllers know the system and its current state after
 * initialization, others receive the required information in their update methods.
 * 
 * Este pacote fornece classes de controlador úteis para a visualização dos estados do sistema em aplicativos de simulação.
 * Cada classe de controlador fornece um construtor que aceita um nó raiz (um BorderPane ou um Canvas).
 * O construtor adiciona elementos ao nó que serão usados para visualizar o estado do sistema. 
 * As atualizações e interações são gerenciadas pelo controlador. 
 * Alguns controladores conhecem o sistema e seu estado atual após a inicialização, 
 * outros recebem as informações necessárias em seus métodos de atualização.
 * 
 * @author Ruediger Lunde
 */
package aima.gui.fx.views;