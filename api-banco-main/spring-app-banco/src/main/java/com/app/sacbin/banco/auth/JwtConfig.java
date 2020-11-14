package com.app.sacbin.banco.auth;

public class JwtConfig {
	
	public static final String RSA_PRIVADA="-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEpAIBAAKCAQEA0WaQwV9mHY+cvxvAKWkKexh9k5Y7vlCXycol4lOZOS67jvYU\n" + 
			"afQEtQtBWL0X1NzGMRCk6/q4gf6HtFvOYMfNG9NB3zPN40EEKFuagQyQhqrB8KzT\n" + 
			"45gUYQmJhsmIpKSN7yaqBsExUyeBWj7B2bzwvMTOkNIZmjFriGJHrXuaB/gqTODU\n" + 
			"fJtLzn/hy+364sNjcIdNiSF/TAX+1T5uL3jPX/KNCZ8rbRCas6kWHYUGdqW/utPu\n" + 
			"YzPRpE1icvgqwPJoDzWi9EvlTXxQGdRVqR8qEi5pjbb5ZBNKL8IYF9cQEfTVnIQ4\n" + 
			"W6S/vDidp8T9WxseGPdd3gYAMpV7VwxALTYz2QIDAQABAoIBAQC/wPqh+ahbPZ2+\n" + 
			"a70mrqgIXT7xncuL1eWJxfG3NfLEKIVcvv+mnuyIlYv7pP1j0eA0IhfEeM3pTJoc\n" + 
			"kU2F1rF+35AcwyWxC2KxSmFL96OJjmkW6k0Gx8cxrTghFABrNL082N0uXk+65BxR\n" + 
			"9dIygBC77EV03NDRIJxmQgl9VgiRbgmfkaIpadd3FkS2NEmduPDpzYkKOMnSnEEW\n" + 
			"XiO6bB1ikx3RCqDOrh1P/I8eThdNuzp207o1eJQ/bfSqrAFrAEIdxmaiQspE5UbL\n" + 
			"kbYc2ggoefR8HA7feXlSW8BBl3Gdt85JghsbOOkBEibfgkGpBkTKbSJxsUtJDKRW\n" + 
			"pDylwAMBAoGBAO7ELH2YsB3uG9ELEVex8lc3/Xf8BhDbOhDoiGX++lDaBI7eGSJf\n" + 
			"cE+aC3rg1ZXovd+LIz3bKlG/rvGXqDOo7VB5qUvTEyN022LUCdjQbBaBpnsUXdPC\n" + 
			"jrBy9sQUxQrCdMLPgd61OY2zzmmZIRIaWc0e5krP6n/mCnB6YJC26KAJAoGBAOCD\n" + 
			"yPgnYEBGUONJrus0JmSAAOk76kPc/aJggHI7S6PEn9XmwlGHqb8BptL1yOG9iuId\n" + 
			"OBGsNOZULrJoqlH9sYxnWUl8PrxEnsuatbTpfRPGk5krOXLo6lD7n33TsEfQ4Wyw\n" + 
			"odurrIk5KHPY9M7jqVO0MgBvqhkwDqqmCJG0cUlRAoGAA8KDENc+rrn5JimOdFsQ\n" + 
			"/d6b1y/YyJsrJukCfNivCGbme3lz29603gwG8kBoHJw1oTeHroms+OyTzKoes/GN\n" + 
			"Cx9fUxpXys8kRUIhhZCCozgXbwi7EYKWzKCC0kOhdrHpNMgfu2oPJfQW5ALNSoOv\n" + 
			"tlMuPS9Y+fqdX3gN3TmEIEECgYAzlBMHb4RdP8o1bSgSQNjRHdcXvfwDuzFJrIHV\n" + 
			"vGmUJgfSTEE4GcKVbvu0W2La+YB+kdfft4AvqgdQVVtLmsy/RL7ucuy2s80HWXOF\n" + 
			"LF7fvC8McTGxhHDQSf5KGefVl9cx8SI+JSJuJAN3GdCj9wlfgXY7Q2wAfVnhOmOd\n" + 
			"laaxAQKBgQDjnpeCQmb6WHtaffL44TDl+0TIK8r40CEYaW8t7fCS9CMAS/1k3Bzp\n" + 
			"GcKhq+A7gpyyskhlPIqaPeVZMdVcIhEpkO1jrWdgk8Af7sfcPAkOfbxioMP1EQz7\n" + 
			"ad84P/uG84Le1PoqDGcFWq4LiLGgbRhbOlVS6q4T48mkbsjnUVnBhw==\n" + 
			"-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0WaQwV9mHY+cvxvAKWkK\n" + 
			"exh9k5Y7vlCXycol4lOZOS67jvYUafQEtQtBWL0X1NzGMRCk6/q4gf6HtFvOYMfN\n" + 
			"G9NB3zPN40EEKFuagQyQhqrB8KzT45gUYQmJhsmIpKSN7yaqBsExUyeBWj7B2bzw\n" + 
			"vMTOkNIZmjFriGJHrXuaB/gqTODUfJtLzn/hy+364sNjcIdNiSF/TAX+1T5uL3jP\n" + 
			"X/KNCZ8rbRCas6kWHYUGdqW/utPuYzPRpE1icvgqwPJoDzWi9EvlTXxQGdRVqR8q\n" + 
			"Ei5pjbb5ZBNKL8IYF9cQEfTVnIQ4W6S/vDidp8T9WxseGPdd3gYAMpV7VwxALTYz\n" + 
			"2QIDAQAB\n" + 
			"-----END PUBLIC KEY-----";

}
