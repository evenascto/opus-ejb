package com.futurevision.rpg.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the COMMON_AUDIO database table.
 * 
 */
@Entity
@Table(name = "COMMON_AUDIO")
@SequenceGenerator(name = "COMMON_AUDIO_ID_GENERATOR", sequenceName = "SEQ_COMMON_AUDIO")
public class CommonAudio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMMON_AUDIO_ID_GENERATOR")
	@Column(name = "COD_COM_AUD")
	private Long id;

	@Lob
	private Byte[] audio;

	private String description;

	private String name;

	public CommonAudio() {
	}

	public Byte[] getAudio() {
		return audio;
	}

	public void setAudio(Byte[] audio) {
		this.audio = audio;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}