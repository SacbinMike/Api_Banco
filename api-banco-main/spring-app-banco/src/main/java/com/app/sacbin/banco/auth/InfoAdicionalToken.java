package com.app.sacbin.banco.auth;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;
import com.app.sacbin.banco.model.entity.Usuario;
import com.app.sacbin.banco.model.service.IUsuarioService;

@Component
public class InfoAdicionalToken implements TokenEnhancer{
	
	@Autowired
	private IUsuarioService usuarioService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Usuario usuario=usuarioService.findByUsername(authentication.getName());
		
		Map<String,Object> info = new HashMap<>();
		info.put("info_adicional","connected".concat(authentication.getName()));
		info.put("id_usuario",usuario.getId());
		info.put("nombre_real", usuario.getPersonal().getNombre());
		info.put("agencia_asignada",usuario.getPersonal().getApellido());
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		return accessToken;
	}

}
