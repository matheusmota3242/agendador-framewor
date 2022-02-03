package br.ufrn.mmgg.agendadorframework.service.impl;

import org.springframework.scheduling.annotation.Scheduled;

import br.ufrn.mmgg.agendadorframework.service.IAgendadorService;

public abstract class AgendadorService implements IAgendadorService {

	@Scheduled(fixedDelayString = "${fixedDelay}")
	public void agendar() {
		aplicarLogica();
	}
}
