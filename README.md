# Repositorio de Engenharia de Software.

## Comentários do livro Software Engineering at Google | 11/08

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

> Resumo: O contraste fundamental entre programação e engenharia de software reside em três áreas críticas: tempo, escala e compromissos (tomadas de decisões/trade offs) envolvidos. Em projetos de engenharia de software, a atenção à passagem do tempo e à futura necessidade de mudanças é crucial. Em organizações de engenharia de software, a ênfase recai na escala e eficiência, tanto para o software desenvolvido quanto para a própria organização. Além disso, como engenheiros de software, somos chamados a tomar decisões mais complexas com resultados de alto impacto, frequentemente baseados em estimativas imprecisas de tempo e crescimento.

"Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

> Resenha: Em essência, engenharia de software envolve considerar um cronograma mais amplo e uma variedade maior de tarefas além de simplesmente escrever código. Essas tarefaz são: desenvolver, modificar, manter (manutenção) um software, levando em conta um cronograma e trade offs. "Trade-offs" refere-se às decisões que precisam ser tomadas ao escolher entre diferentes opções, onde ganhos em uma área muitas vezes significam perdas em outra. Isso se relaciona com a ideia de que em engenharia de software, as escolhas feitas em relação a aspectos como tempo, funcionalidades, desempenho e recursos podem ter impactos variados e interdependentes. Por exemplo, ao desenvolver um software, um engenheiro pode enfrentar um trade-off entre a entrega rápida (tempo) e a robustez (qualidade). Escolher desenvolver rapidamente pode levar a problemas de qualidade no futuro. Da mesma forma, ao otimizar um sistema para lidar com uma grande escala de usuários, pode ser necessário sacrificar alguma simplicidade ou flexibilidade.  

## 3 Exemplos de Trade Off:

* Entrega rápida x qualidade
* Funcionalidade do software x Liberdade do usuário
* Segurança x Facilidade de acesso

## 10 Usability Heuristics for User Interface Design

#### 1 - Visibilidade do status do sistema

exemplo negativo: Iniciar do windows

![INICIAR DO WINDOWS](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/Windows-10-install-is-stuck-during-Installation.webp)

exemplo positivo: status do whatsapp

![StatusWhatsApp](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/fotojet-9.jpg)

#### 2 - Compatibilide e correspondência entre o sistema e o mundo real

exemplo negativo: Mensagem de erro 404 no navegador

![Erro404](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/Wiki404.png)

exemplo positivo: "Pastas" no sistema operacional (metáforas do OS para funcionalidades)

![Folder](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/folder.png))

#### 3 - Liberdade e controle de usuário

exemplo negativo: 

exemplo positivo: control z (photoshop)

![Photoshop](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/photoshop.png)

#### 4 - Consistência e Padrões

exemplo negativo: 

exemplo positivo: Cores padrões (verde amarelo vermelho) para status / botão de fechar ou sair no topo direito da tela)

![Fechar](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/fechar%20min%20max.png))

#### 5 - Prevenção de erros

exemplo negativo: 

exemplo positivo: Mensagem de "tem certeza que deseja continuar?"
![Continuar](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/confirmar_exclusao_empenho.png)

#### 6 - Reconhecer ao invés de lembrar

exemplo negativo: 

exemplo positivo: menu "cascata" com as opções 
![Cascata](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/Cascata.png)

#### 7 - Flexibilidade e Eficiência

exemplo negativo: 

exemplo positivo: Atalhos do teclado photoshop

![Atalhos](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/photoshop-cheat-sheet-featured.jpg)

#### 8 - Estética e Design minimalista

exemplo negativo: Sites antigos (internet antes das redes sociais)

![Site2000's](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/bad-und-ugly-websites-preview.png)

exemplo positivo: Google

![Google](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/Google_web_search.png)

#### 9 - Auxiliar usuários a reconhecer, diagnosticar e recuperar erros

exemplo negativo: mensagem de erro do windows (diagnostico de sistema com muitas informações tecnicas que não são de amplo conhecimento do usuário comum)

![ErroWin](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/Windows_XP_BSOD.png)

exemplo positivo: Mensagem de erro com informações relevantes ao usuário (ops algo deu errado, tente fazer x)

![ErroX](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/sdd.jpg)

#### 10 - Ajuda e Documentação

exemplo negativo: TempleOs

![TempleOs](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/687474703a2f2f696d6775722e636f6d2f317959735548492e706e67.png)

exemplo positivo: Documentação Python 

![PythonDoc](https://github.com/Michel-Momose/Bertoti/blob/main/Engenharia%20de%20Software/imagens/7383178.png)

## Diagrama de Casos de Uso

![DiagramaCasoUso](https://github.com/Michel-Momose/Bertoti/blob/main/Diagrama%20de%20caso%20UML.jpg)

## Diagrama de Classes UML

![DiagramaClasse](https://github.com/Michel-Momose/Bertoti/blob/main/diagrama%20de%20classe%20estoque.jpg)