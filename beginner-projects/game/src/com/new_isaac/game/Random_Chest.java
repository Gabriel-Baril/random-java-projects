package com.new_isaac.game;

public class Random_Chest {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 100);
		int rand2 = (int) (Math.random() * 100);
		int rand3 = (int) (Math.random() * 100);
		int rand4 = (int) (Math.random() * 100);
		int rand5 = (int) (Math.random() * 100);
		int rand6 = (int) (Math.random() * 100);
		int rand7 = (int) (Math.random() * 100);
		int rand8 = (int) (Math.random() * 100);
		int rand9 = (int) (Math.random() * 100);
		int rand10 = (int) (Math.random() * 100);
		int rand11 = (int) (Math.random() * 100);
		int rand12 = (int) (Math.random() * 100);
		int rand13 = (int) (Math.random() * 100);
		int rand14 = (int) (Math.random() * 100);
		int rand15 = (int) (Math.random() * 100);
		int rand16 = (int) (Math.random() * 100);
		int rand17 = (int) (Math.random() * 100);
		int rand18 = (int) (Math.random() * 100);
		int rand19 = (int) (Math.random() * 100);
		int rand20 = (int) (Math.random() * 1000);
		int rand21 = (int) (Math.random() * 100);
		int rand22 = (int) (Math.random() * 100);
		int rand23 = (int) (Math.random() * 100);

		int piece_1 = 0;
		int nickel_5 = 0;
		int argent_10 = 0;

		int coeur_rouge = 0;
		int demi_coeur_rouge = 0;
		int coeur_bleu = 0;
		int coeur_or = 0;
		int coeur_blanc = 0;

		int clef = 0;
		int bomb = 0;

		int runeDagaz = 0;
		int runeEhwas = 0;
		int runeHagalaz = 0;
		int runeJera = 0;
		int runeAlgiz = 0;
		int runeAnsuz = 0;
		int runeBerkano = 0;
		int runePerthro = 0;
		int runeBlank = 0;

		int cardFool = 0;
		int cardMagician = 0;
		int cardHightPriestess = 0;
		int cardEmpress = 0;
		int cardEmperor = 0;
		int cardHierophant = 0;
		int cardLovers = 0;
		int cardChariot = 0;
		int cardJustice = 0;
		int cardHermit = 0;
		int cardWheelFortune = 0;
		int cardStrength = 0;
		int cardHangedMan = 0;
		int cardDeath = 0;
		int cardTemperance = 0;
		int cardDevil = 0;
		int cardTower = 0;
		int cardStars = 0;
		int cardMoon = 0;
		int cardSun = 0;
		int cardJudgement = 0;
		int cardWorld = 0;

		int cardJoker = 0;
		int card2Diamond = 0;
		int card2Club = 0;
		int card2Spade = 0;
		int card2Hearts = 0;
		int cardSuicideKing = 0;
		int cardChaos = 0;
		int cardCredit = 0;
		int cardRules = 0;
		int cardAgainstHumanity = 0;
		int cardDoubleAct = 0;
		int cardSesame = 0;
		int allCardSpecial[] = { cardJoker, card2Diamond, card2Club, card2Spade, card2Hearts, cardSuicideKing,
				cardChaos, cardCredit, cardRules, cardAgainstHumanity, cardDoubleAct, cardSesame };

		int pill = 0;
		int trinket = 0;
		int batterie = 0;
		int miniChestOr = 0;
		int miniChestNormal = 0;

		System.out.println("Le contenue de ce coffre est : ");
		System.out.println("");
		System.out.println("");

		// -------------------------------------------------------------

		if (rand < 3) {
			if (rand2 < 30) {
				nickel_5++;
			}
		}

		if (rand16 < 70) {
			piece_1 = 2;
			if (rand16 < 40) {
				piece_1 = 5;
				if (rand16 < 5) {
					piece_1 = 7;

				}
			}
		}

		if (rand2 < 30) {
			nickel_5 = 1;
			if (rand2 < 5) {
				nickel_5 = 2;

			}
		}

		if (nickel_5 == 0) {
			if (rand17 < 15) {
				argent_10 = 1;
			}

		} else {
			if (rand17 < 5) {
				argent_10 = 1;
			}
		}

		if (piece_1 < 3) {
			if (rand6 < 30) {
				nickel_5++;
			}
		}

		// -------------------------------------------------------------

		if (rand3 < 70) {
			coeur_rouge = 1;
			if (rand3 < 30) {
				coeur_rouge = 2;
				if (rand3 < 5) {
					coeur_rouge = 3;

				}

			}
		}

		// -------------------------------------------------------------

		if (coeur_rouge == 1) {
			if (rand4 < 25) {
				demi_coeur_rouge = 1;
			}

		}

		if (coeur_rouge == 2) {
			if (rand4 < 15) {
				demi_coeur_rouge = 2;
			}

		}
		if (coeur_rouge == 3) {
			if (rand4 < 5) {
				demi_coeur_rouge = 3;
			}

		}

		// -------------------------------------------------------------

		if (rand5 < 35) {
			coeur_bleu = 1;
			if (rand5 < 10) {
				coeur_bleu = 2;
			}
		}

		// -------------------------------------------------------------

		if (piece_1 > 5) {
			if (rand6 < 5) {
				coeur_or = 1;
			}
		} else {
			if (rand6 < 2) {
				coeur_or = 1;
			}
		}

		// -------------------------------------------------------------

		if (coeur_bleu == 0) {
			if (rand11 < 14) {
				coeur_blanc = 1;
				if (rand3 < 7) {
					coeur_blanc = 2;
				}

			}

		} else {
			if (rand11 < 5) {
				coeur_blanc = 1;
				if (rand3 < 2) {
					coeur_blanc = 2;
				}

			}
		}

		// -------------------------------------------------------------

		if (rand7 < 60) {
			clef = 1;
			if (rand7 < 30) {
				clef = 2;
				if (rand7 < 10) {
					clef = 3;
					if (rand7 < 3) {
						clef = 4;
					}
				}
			}
		}

		// -------------------------------------------------------------

		if (rand8 < 60) {
			bomb = 1;
			if (rand8 < 30) {
				bomb = 2;
				if (rand8 < 10) {
					bomb = 3;
					if (rand8 < 3) {
						bomb = 4;
					}
				}
			}
		}

		// -------------------------------------------------------------
		if (rand19 < 3) {
			trinket = 1;
			if (rand20 < 5) {
				trinket = 2;

			}

		}

		// -------------------------------------------------------------
		if (rand21 < 6) {
			batterie = 1;
			if (rand20 < 10) {
				batterie = 2;
				if (rand20 < 1) {
					batterie = 3;
				}
			}

		}

		// -------------------------------------------------------------
		if (rand22 < 2) {
			miniChestOr = 1;
		}

		// -------------------------------------------------------------
		if (rand23 < 2) {
			miniChestNormal = 1;
		}

		// -------------------------------------------------------------

		if (rand18 < 7) {
			if (rand13 < 70)
				pill = 1;
			piece_1 = 0;
			nickel_5 = 0;
			argent_10 = 0;
			coeur_rouge = 0;
			demi_coeur_rouge = 0;
			coeur_bleu = 0;
			coeur_or = 0;
			coeur_blanc = 0;
			clef = 0;
			bomb = 0;
			batterie = 0;

			if (rand13 < 30) {
				pill = 2;
				piece_1 = 0;
				nickel_5 = 0;
				argent_10 = 0;
				coeur_rouge = 0;
				demi_coeur_rouge = 0;
				coeur_bleu = 0;
				coeur_or = 0;
				coeur_blanc = 0;
				clef = 0;
				bomb = 0;
				batterie = 0;

				if (rand13 < 5) {
					pill = 3;
					piece_1 = 0;
					nickel_5 = 0;
					argent_10 = 0;
					coeur_rouge = 0;
					demi_coeur_rouge = 0;
					coeur_bleu = 0;
					coeur_or = 0;
					coeur_blanc = 0;
					clef = 0;
					bomb = 0;
					batterie = 0;

					if (pill == 0) {

					}
				}
			}

		}

		// -------------------------------------------------------------

		if (rand12 < 20) {

			if (rand13 < 4) {
				cardFool = 1;
				if (rand7 == 33 || rand7 == 45) {
					cardFool = 2;

				}

			} else if (rand13 > 4 && rand13 < 8) {
				cardMagician = 1;
				if (rand7 == 38 || rand7 == 42) {
					cardMagician = 2;

				}

			} else if (rand13 > 8 && rand13 < 12) {
				cardHightPriestess = 1;
				if (rand7 == 87 || rand7 == 2) {
					cardHightPriestess = 2;

				}

			} else if (rand13 > 12 && rand13 < 16) {
				cardEmpress = 1;
				if (rand7 == 97 || rand7 == 4) {
					cardEmpress = 2;

				}

			} else if (rand13 > 16 && rand13 < 20) {
				cardEmperor = 1;
				if (rand7 == 27 || rand7 == 49) {
					cardEmperor = 2;

				}

			} else if (rand13 > 20 && rand13 < 24) {
				cardHierophant = 1;
				if (rand7 == 73 || rand7 == 80) {
					cardHierophant = 2;

				}

			} else if (rand13 > 24 && rand13 < 28) {
				cardLovers = 1;
				if (rand7 == 91 || rand7 == 5) {
					cardLovers = 2;

				}

			} else if (rand13 > 28 && rand13 < 32) {
				cardChariot = 1;
				if (rand7 == 55 || rand7 == 78) {
					cardChariot = 2;

				}

			} else if (rand13 > 32 && rand13 < 36) {
				cardWorld = 1;
				if (rand7 == 89 || rand7 == 26) {
					cardWorld = 2;

				}

			} else if (rand13 > 36 && rand13 < 40) {
				cardHermit = 1;
				if (rand7 == 37 || rand7 == 46) {
					cardHermit = 2;

				}

			} else if (rand13 > 40 && rand13 < 44) {
				cardWheelFortune = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardWheelFortune = 2;

				}

			} else if (rand13 > 44 && rand13 < 48) {
				cardStrength = 1;
				if (rand7 == 99 || rand7 == 34) {
					cardStrength = 2;

				}

			} else if (rand13 > 48 && rand13 < 52) {
				cardHangedMan = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardHangedMan = 2;

				}

			} else if (rand13 > 52 && rand13 < 56) {
				cardDeath = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardDeath = 2;

				}

			} else if (rand13 > 56 && rand13 < 60) {
				cardTemperance = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardTemperance = 2;

				}

			} else if (rand13 > 60 && rand13 < 64) {
				cardDevil = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardDevil = 2;

				}

			} else if (rand13 > 64 && rand13 < 68) {
				cardTower = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardTower = 2;

				}

			} else if (rand13 > 68 && rand13 < 72) {
				cardMoon = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardMoon = 2;

				}

			} else if (rand13 > 72 && rand13 < 76) {
				cardSun = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardSun = 2;

				}

			} else if (rand13 > 76 && rand13 < 80) {
				cardJudgement = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardJudgement = 2;

				}

			} else if (rand13 > 80 && rand13 < 84) {
				cardStars = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardStars = 2;

				}

			} else {
				cardJustice = 1;
				if (rand7 == 54 || rand7 == 63) {
					cardJustice = 2;

				}

			}

		}

		if (cardFool != 0 || cardMagician != 0 || cardHightPriestess != 0 || cardEmpress != 0 || cardEmperor != 0
				|| cardHierophant != 0 || cardLovers != 0 || cardChariot != 0 || cardWorld != 0 || cardHermit != 0
				|| cardWheelFortune != 0 || cardStrength != 0 || cardHangedMan != 0 || cardDeath != 0
				|| cardTemperance != 0 || cardDevil != 0 || cardTower != 0 || cardMoon != 0 || cardSun != 0
				|| cardJudgement != 0 || cardStars != 0 || cardJustice != 0) {

			piece_1 = piece_1 / 2 + 1;
			nickel_5 = nickel_5 / 2 + 1;
			argent_10 = argent_10 / 2 + 1;

			coeur_rouge = coeur_rouge / 2 + 1;
			demi_coeur_rouge = demi_coeur_rouge / 2 + 1;
			coeur_bleu = coeur_bleu / 2 + 1;
			coeur_or = coeur_or / 2 + 1;
			coeur_blanc = coeur_blanc / 2 + 1;
			batterie = batterie / 2 + 1;

			clef = clef / 2 + 1;
			bomb = bomb / 2 + 1;

		}

		// -------------------------------------------------------------

		if (rand14 < 5) {

			if (rand15 > 10 && rand15 < 20) {
				cardJoker = 1;
				if (rand3 == 54 || rand3 == 63) {
					cardJoker = 2;

				}

			} else if (rand10 > 20 && rand15 < 30) {
				card2Diamond = 1;
				if (rand3 == 5 || rand3 == 3) {
					card2Diamond = 2;

				}

			} else if (rand10 > 30 && rand15 < 40) {
				card2Club = 1;
				if (rand3 == 25 || rand3 == 73) {
					card2Club = 2;

				}

			} else if (rand10 > 40 && rand15 < 50) {
				card2Spade = 1;
				if (rand3 == 47 || rand3 == 21) {
					card2Spade = 2;

				}

			} else if (rand10 > 50 && rand15 < 60) {
				card2Hearts = 1;
				if (rand3 == 12 || rand3 == 33) {
					card2Hearts = 2;

				}

			} else if (rand10 > 60 && rand15 < 70) {
				cardSuicideKing = 1;
				if (rand3 == 78 || rand3 == 89) {
					cardSuicideKing = 2;

				}

			} else if (rand10 > 70 && rand15 < 80) {
				cardChaos = 1;
				if (rand3 == 83 || rand3 == 31) {
					cardChaos = 2;

				}

			} else if (rand10 > 80 && rand15 < 90) {
				cardCredit = 1;
				if (rand3 == 42 || rand3 == 27) {
					cardCredit = 2;

				}

			} else if (rand10 > 80 && rand15 < 90) {
				cardRules = 1;
				if (rand3 == 14 || rand3 == 73) {
					cardRules = 2;

				}

			} else if (rand10 > 60 && rand15 < 70) {
				cardAgainstHumanity = 1;
				if (rand3 == 15 || rand3 == 85) {
					cardAgainstHumanity = 2;

				}

			} else if (rand10 > 70 && rand15 < 80) {
				cardDoubleAct = 1;
				if (rand3 == 25 || rand3 == 26) {
					cardDoubleAct = 2;

				}

			} else {
				cardSesame = 1;
				if (rand3 == 3 || rand3 == 95) {
					cardSesame = 2;

				}

			}

		}

		if (cardJoker != 0 || card2Diamond != 0 || card2Club != 0 || card2Spade != 0 || card2Hearts != 0
				|| cardSuicideKing != 0 || cardChaos != 0 || cardCredit != 0 || cardRules != 0
				|| cardAgainstHumanity != 0 || cardDoubleAct != 0 || cardSesame != 0) {

			piece_1 = 0;
			nickel_5 = 0;
			argent_10 = 0;

			coeur_rouge = 0;
			demi_coeur_rouge = 0;
			coeur_bleu = 0;
			coeur_or = 0;
			coeur_blanc = 0;
			batterie = 0;

			clef = 0;
			bomb = 0;

		}

		// -------------------------------------------------------------

		if (rand9 < 5) {

			if (rand10 > 10 && rand10 < 20) {
				runeDagaz = 1;

			} else if (rand10 > 20 && rand10 < 30) {
				runeEhwas = 1;

			} else if (rand10 > 30 && rand10 < 40) {
				runeHagalaz = 1;

			} else if (rand10 > 40 && rand10 < 50) {
				runeJera = 1;

			} else if (rand10 > 50 && rand10 < 60) {
				runeAlgiz = 1;

			} else if (rand10 > 60 && rand10 < 70) {
				runeAnsuz = 1;

			} else if (rand10 > 70 && rand10 < 80) {
				runeBerkano = 1;

			} else if (rand10 > 80 && rand10 < 90) {
				runePerthro = 1;

			} else {
				runeBlank = 1;

			}
		}

		if (runeDagaz != 0 || runeEhwas != 0 || runeHagalaz != 0 || runeJera != 0 || runeAlgiz != 0 || runeAnsuz != 0
				|| runeBerkano != 0 || runePerthro != 0 || runeBlank != 0) {

			piece_1 = 0;
			nickel_5 = 0;
			argent_10 = 0;

			coeur_rouge = 0;
			demi_coeur_rouge = 0;
			coeur_bleu = 0;
			coeur_or = 0;
			coeur_blanc = 0;

			clef = 0;
			bomb = 0;
			batterie = 0;

		}

		// ------------------> Renvoit de tout le nombre ditems(toujous mettre
		// les
		// renvoit a la fin)

		if (piece_1 == 0) {
		} else {
			System.out.println("Nombre de piece de 1 : " + piece_1);
		}

		if (nickel_5 == 0) {
		} else {
			System.out.println("Nombre de piece de 5 : " + nickel_5);
		}

		if (argent_10 == 0) {
		} else {
			System.out.println("Nombre de piece de 10 : " + argent_10);
		}
		if (coeur_rouge == 0) {
		} else {
			System.out.println("Nombre de coeur rouge : " + coeur_rouge);
		}
		if (demi_coeur_rouge == 0) {
		} else {
			System.out.println("Nombre de demi coeur rouge : " + demi_coeur_rouge);
		}
		if (coeur_bleu == 0) {
		} else {
			System.out.println("Nombre de coeur bleu : " + coeur_bleu);
		}
		if (coeur_or == 0) {
		} else {
			System.out.println("Nombre de coeur dor : " + coeur_or);
		}
		if (coeur_blanc == 0) {
		} else {
			System.out.println("Nombre de coeur blanc : " + coeur_blanc);
		}
		if (bomb == 0) {
		} else {
			System.out.println("Nombre de bomb : " + bomb);
		}
		if (clef == 0) {
		} else {
			System.out.println("Nombre de clef : " + clef);
		}
		if (pill == 0) {
		} else {
			System.out.println("Nombre de pill : " + pill);
		}
		if (trinket == 0) {
		} else {
			System.out.println("Nombre de trinket : " + trinket);
		}
		if (batterie == 0) {
		} else {
			System.out.println("Nombre de batterie : " + batterie);
		}
		if (miniChestOr == 0) {
		} else {
			System.out.println("Nombre de mini coffre en or : " + miniChestOr);
		}
		if (miniChestNormal == 0) {
		} else {
			System.out.println("Nombre de mini coffre normal : " + miniChestNormal);
		}

		// Renvoit du nombre de carte(toujous mettre les
		// renvoit a la fin)

		if (cardJoker == 0) {
		} else {
			System.out.println("carte the joker : " + cardJoker);
		}
		if (card2Diamond == 0) {
		} else {
			System.out.println("carte two of diamond : " + card2Diamond);
		}
		if (card2Club == 0) {
		} else {
			System.out.println("carte two of club : " + card2Club);
		}
		if (card2Spade == 0) {
		} else {
			System.out.println("carte two of spade : " + card2Spade);
		}
		if (card2Hearts == 0) {
		} else {
			System.out.println("carte two of hearts : " + card2Hearts);
		}
		if (cardSuicideKing == 0) {
		} else {
			System.out.println("carte the suicide king : " + cardSuicideKing);
		}
		if (cardChaos == 0) {
		} else {
			System.out.println("carte the chaos : " + cardChaos);
		}
		if (cardCredit == 0) {
		} else {
			System.out.println("carte the Credit : " + cardCredit);
		}
		if (cardRules == 0) {
		} else {
			System.out.println("carte the Rules : " + cardRules);
		}
		if (cardAgainstHumanity == 0) {
		} else {
			System.out.println("carte agains humanity : " + cardAgainstHumanity);
		}
		if (cardDoubleAct == 0) {
		} else {
			System.out.println("carte ? : " + cardDoubleAct);
		}
		if (cardSesame == 0) {
		} else {
			System.out.println("carte Sesame : " + cardSesame);
		}

		// -----------------> Renvoit du nombre de rune(toujous mettre les
		// renvoit a la fin)

		if (runeDagaz == 0) {
		} else {
			System.out.println("Rune Dagaz : " + runeDagaz);
		}
		if (runeEhwas == 0) {
		} else {
			System.out.println("Rune Ehwas : " + runeEhwas);
		}
		if (runeHagalaz == 0) {
		} else {
			System.out.println("Rune Hagalaz : " + runeHagalaz);
		}
		if (runeJera == 0) {
		} else {
			System.out.println("Rune Jera : " + runeJera);
		}
		if (runeAlgiz == 0) {
		} else {
			System.out.println("Rune Algiz : " + runeAlgiz);
		}
		if (runeAnsuz == 0) {
		} else {
			System.out.println("Rune Ansuz : " + runeAnsuz);
		}
		if (runeBerkano == 0) {
		} else {
			System.out.println("Rune Berkano : " + runeBerkano);
		}
		if (runePerthro == 0) {
		} else {
			System.out.println("Rune Perthro : " + runePerthro);
		}
		if (runeBlank == 0) {
		} else {
			System.out.println("Rune Blank : " + runeBlank);
		}

		// -----------------> Renvoit du nombre de carte(toujous mettre les
		// renvoit a la fin)

		if (cardFool == 0) {
		} else {
			System.out.println("carte the fool : " + cardFool);
		}
		if (cardMagician == 0) {
		} else {
			System.out.println("carte the magiciant : " + cardMagician);
		}
		if (cardHightPriestess == 0) {
		} else {
			System.out.println("carte the hight priestess : " + cardHightPriestess);
		}
		if (cardEmpress == 0) {
		} else {
			System.out.println("carte the empress : " + cardEmpress);
		}
		if (cardEmperor == 0) {
		} else {
			System.out.println("carte the emperor : " + cardEmperor);
		}
		if (cardHierophant == 0) {
		} else {
			System.out.println("carte the hierophant : " + cardHierophant);
		}
		if (cardLovers == 0) {
		} else {
			System.out.println("carte the lovers : " + cardLovers);
		}
		if (cardChariot == 0) {
		} else {
			System.out.println("carte the chariot : " + cardChariot);
		}
		if (cardWorld == 0) {
		} else {
			System.out.println("carte the world : " + cardWorld);
		}
		if (cardHermit == 0) {
		} else {
			System.out.println("carte the hermit : " + cardHermit);
		}
		if (cardWheelFortune == 0) {
		} else {
			System.out.println("carte wheel of fortune : " + cardWheelFortune);
		}
		if (cardStrength == 0) {
		} else {
			System.out.println("carte the strength : " + cardStrength);
		}
		if (cardHangedMan == 0) {
		} else {
			System.out.println("carte the hanged man : " + cardHangedMan);
		}
		if (cardDeath == 0) {
		} else {
			System.out.println("carte the death : " + cardDeath);
		}
		if (cardTemperance == 0) {
		} else {
			System.out.println("carte temperance : " + cardTemperance);
		}
		if (cardDevil == 0) {
		} else {
			System.out.println("carte the devil : " + cardDevil);
		}
		if (cardTower == 0) {
		} else {
			System.out.println("carte the tower : " + cardTower);
		}
		if (cardMoon == 0) {
		} else {
			System.out.println("carte the moon : " + cardMoon);
		}
		if (cardSun == 0) {
		} else {
			System.out.println("carte the sun : " + cardSun);
		}
		if (cardJudgement == 0) {
		} else {
			System.out.println("carte the judgement : " + cardJudgement);
		}
		if (cardJustice == 0) {
		} else {
			System.out.println("carte the justice : " + cardJustice);
		}
		if (cardStars == 0) {
		} else {
			System.out.println("carte the stars : " + cardStars);
		}

	}

}
