using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace LesPays
{
	public partial class Form1 : Form
	{

		private List<String> lesPays;
		private List<String> laSelection;

		public Form1()
		{
			InitializeComponent();
			lesPays = new List<string>();
			laSelection = new List<string>();
			remplirCollection();
		}

		private void Form1_Load(object sender, EventArgs e)
		{
			chargerTout();
			lblNomPays.Text = "";
		}

		private void groupBox1_Enter(object sender, EventArgs e)
		{

		}

		private void label1_Click(object sender, EventArgs e)
		{

		}

		private void label6_Click(object sender, EventArgs e)
		{

		}

		private void button1_Click(object sender, EventArgs e)
		{
			this.Close();
		}

		private void remplirCollection()
		{
			lesPays.Add("AD;Andorre (l’);Andorre-la-Vieille;l’euro;EUR;EU");
			lesPays.Add("AE;Émirats arabes unis (les);Abou Dhabi;le dirham des Émirats arabes unis;AED;AS");
			lesPays.Add("AF;Afghanistan (l’);Kaboul;l’afghani;AFN;AS");
			lesPays.Add("AG;Antigua-et-Barbuda;Saint John’s;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("AI;Anguilla;The Valley;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("AL;Albanie (l’);Tirana;le lek;ALL;EU");
			lesPays.Add("AM;Arménie (l’);Erevan;le dram;AMD;AS");
			lesPays.Add("AO;Angola (l’);Luanda;le kwanza;AOA;AF");
			lesPays.Add("AQ;Antarctique (l’);non renseigné;non renseigné;non renseigné;AN");
			lesPays.Add("AR;Argentine (l’);Buenos Aires;le peso argentin;ARS;SA");
			lesPays.Add("AS;Samoa américaines (les);Pago Pago;le dollar des États-Unis;USD;OC");
			lesPays.Add("AT;Autriche (l’);Vienne;l’euro;EUR;EU");
			lesPays.Add("AU;Australie (l’);Canberra;le dollar australien;AUD;OC");
			lesPays.Add("AW;Aruba;Oranjestad;le florin arubain;AWG;NA");
			lesPays.Add("AX;Îles Åland (les);Mariehamn;l’euro ;EUR;EU");
			lesPays.Add("AZ;Azerbaïdjan (l’);Bakou;le manat azerbaïdjanais;AZN;EU");
			lesPays.Add("BA;Bosnie-Herzégovine (la);Sarajevo;le mark convertible;BAM;EU");
			lesPays.Add("BB;Barbade (la);Bridgetown;le dollar de la Barbade;BBD;NA");
			lesPays.Add("BD;Bangladesh (le);Dacca;le taka;BDT;AS");
			lesPays.Add("BE;Belgique (la);Bruxelles;l’euro;EUR;EU");
			lesPays.Add("BF;Burkina (le);Ouagadougou;le franc CFA;XOF;AF");
			lesPays.Add("BG;Bulgarie (la);Sofia;le lev;BGN;EU");
			lesPays.Add("BH;Bahreïn;Manama;le dinar de Bahreïn;BHD;AS");
			lesPays.Add("BI;Burundi (le);Gitega;le franc burundais;BIF;AF");
			lesPays.Add("BJ;Bénin (le);Porto-Novo;le franc CFA;XOF;AF");
			lesPays.Add("BL;Saint-Barthélemy;Gustavia;l’euro ;EUR;NA");
			lesPays.Add("BM;Bermudes (les);Hamilton;le dollar des Bermudes;BMD;NA");
			lesPays.Add("BN;Brunei (le);Bandar Seri;le dollar de Brunei;BND;AS");
			lesPays.Add("BO;Bolivie (la);Sucre;le boliviano;BOB;SA");
			lesPays.Add("BR;Brésil (le);Brasilia;le real;BRL;SA");
			lesPays.Add("BS;Bahamas (les);Nassau;le dollar des Bahamas;BSD;NA");
			lesPays.Add("BT;Bhoutan (le);Thimphu;le ngultrum;BTN;AS");
			lesPays.Add("BV;Île Bouvet (l’);non renseigné;non renseigné;non renseigné;AN");
			lesPays.Add("BW;Botswana (le);Gaborone;le pula;BWP;AF");
			lesPays.Add("BY;Biélorussie (la);Minsk;le rouble biélorusse;BYN;EU");
			lesPays.Add("BZ;Belize (le);Belmopan;le dollar de Belize;BZD;NA");
			lesPays.Add("CA;Canada (le);Ottawa;le dollar canadien;CAD;NA");
			lesPays.Add("CC;Îles Cocos (les);West Island;le dollar australien;AUD;AS");
			lesPays.Add("CD;République démocratique du Congo (la);Kinshasa;le franc congolais;CDF;AF");
			lesPays.Add("CF;République centrafricaine (la);Bangui;le franc CFA;XAF;AF");
			lesPays.Add("CH;Suisse (la);Berne;le franc suisse;CHF;EU");
			lesPays.Add("CI;Côte d’Ivoire (la);Yamoussoukro;le franc CFA;XOF;AF");
			lesPays.Add("CK;Îles Cook (les);Avarua;le dollar néo-zélandais;NZD;OC");
			lesPays.Add("CL;Chili (le);Santiago;le peso chilien;CLP;SA");
			lesPays.Add("CM;Cameroun (le);Yaoundé;le franc CFA (BEAC);XAF;AF");
			lesPays.Add("CN;Chine (la);Pékin;le yuan;CNY;AS");
			lesPays.Add("CO;Colombie (la);Bogota;le peso colombien;COP;SA");
			lesPays.Add("CR;Costa Rica (le);San José;le colon costaricien;CRC;NA");
			lesPays.Add("CU;Cuba;La Havane;le peso cubain;CUP;NA");
			lesPays.Add("CV;Cap-Vert (le);Praia;l’escudo du Cap-Vert;CVE;AF");
			lesPays.Add("CW;Curaçao;Willemstad;le florin des Antilles néerlandaises ;ANG;NA");
			lesPays.Add("CX;Île Christmas (l’) ;Flying Fish Cove;le dollar australien;AUD;AS");
			lesPays.Add("CY;Chypre;Nicosie;l’euro;EUR;EU");
			lesPays.Add("CZ;Tchéquie (la);Prague;la couronne tchèque;CZK;EU");
			lesPays.Add("DE;Allemagne (l’);Berlin;l’euro;EUR;EU");
			lesPays.Add("DJ;Djibouti;Djibouti;le franc de Djibouti;DJF;AF");
			lesPays.Add("DK;Danemark (le);Copenhague;la couronne danoise;DKK;EU");
			lesPays.Add("DM;Dominique (la);Roseau;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("DO;République dominicaine (la);Saint-Domingue;le peso dominicain;DOP;NA");
			lesPays.Add("DZ;Algérie (l’);Alger;le dinar algérien;DZD;AF");
			lesPays.Add("EC;Équateur (l’);Quito;le dollar des États-Unis;USD;SA");
			lesPays.Add("EE;Estonie (l’);Tallinn;l’euro ;EUR;EU");
			lesPays.Add("EG;Égypte (l’);Le Caire;la livre égyptienne;EGP;AF");
			lesPays.Add("EH;Sahara occidental (le);El Ayoun;le dirham marocain;MAD;AF");
			lesPays.Add("ER;Érythrée (l’);Asmara;le nakfa;ERN;AF");
			lesPays.Add("ES;Espagne (l’);Madrid;l’euro ;EUR;EU");
			lesPays.Add("ET;Éthiopie (l’);Addis-Abeba;le birr;ETB;AF");
			lesPays.Add("FI;Finlande (la);Helsinki;l’euro;EUR;EU");
			lesPays.Add("FJ;Fidji (les);Suva;le dollar des Fidji;FJD;OC");
			lesPays.Add("FK;Îles Falkland (les);Stanley;la livre des Falkland;FKP;SA");
			lesPays.Add("FM;Micronésie (la);Palikir;le dollar des États-Unis;USD;OC");
			lesPays.Add("FO;Féroé (les);Torshavn;la couronne danoise;DKK;EU");
			lesPays.Add("FR;France (la);Paris;l’euro;EUR;EU");
			lesPays.Add("GA;Gabon (le);Libreville;le franc CFA;XAF;AF");
			lesPays.Add("GD;Grenade (la);Saint George’s;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("GE;Géorgie (la);Tbilissi;le lari;GEL;EU");
			lesPays.Add("GF;Guyane (la);Cayenne;l’euro ;EUR;SA");
			lesPays.Add("GG;Guernesey;Saint-Pierre-Port;la livre de Guernesey;GGP (GG2);EU");
			lesPays.Add("GH;Ghana (le);Accra;le cedi ghanéen;GHS;AF");
			lesPays.Add("GI;Gibraltar;Gibraltar;la livre de Gibraltar;GIP;EU");
			lesPays.Add("GL;Groenland (le);Nuuk;la couronne danoise;DKK;NA");
			lesPays.Add("GM;Gambie (la);Banjul;le dalasi;GMD;AF");
			lesPays.Add("GN;Guinée (la);Conakry;le franc guinéen;GNF;AF");
			lesPays.Add("GP;Guadeloupe (la);Basse-Terre;l’euro;EUR;NA");
			lesPays.Add("GQ;Guinée équatoriale (la);Malabo;le franc CFA;XAF;AF");
			lesPays.Add("GR;Grèce (la);Athènes;l’euro;EUR;EU");
			lesPays.Add("GS;Îles Géorgie du Sud et Sandwich du Sud (les);King Edward Point (Grytviken);non renseigné;non renseigné;AN");
			lesPays.Add("GT;Guatemala (le);Ciudad;le quetzal;GTQ;NA");
			lesPays.Add("GU;Guam;Agaña;le dollar des États-Unis;USD;OC");
			lesPays.Add("GW;Guinée-Bissau (la);Bissau;le franc CFA;XOF;AF");
			lesPays.Add("GY;Guyana (le);Georgetown;le dollar du Guyana;GYD;SA");
			lesPays.Add("HK;Hong Kong;Hong Kong;le dollar de Hong Kong;HKD;AS");
			lesPays.Add("HM;Îles Heard et McDonald (les);non renseigné;non renseigné;non renseigné;AN");
			lesPays.Add("HN;Honduras (le);Tegucigalpa;le lempira;HNL;NA");
			lesPays.Add("HR;Croatie (la);Zagreb;la kuna;HRK;EU");
			lesPays.Add("HT;Haïti;Port-au-Prince;la gourde;HTG;NA");
			lesPays.Add("HU;Hongrie (la);Budapest;le forint;HUF;EU");
			lesPays.Add("ID;Indonésie (l’);Jakarta;la rupiah;IDR;AS");
			lesPays.Add("IE;Irlande (l’);Dublin;l’euro;EUR;EU");
			lesPays.Add("IL;Israël;Tel-Aviv;le shekel;ILS;AS");
			lesPays.Add("IM;Île de Man (l’);Douglas;la livre mannoise;IMP;EU");
			lesPays.Add("IN;Inde (l’);New Delhi;la roupie indienne;INR;AS");
			lesPays.Add("IO;Territoire britannique de l’océan Indien (le);non renseigné;le dollar des États-Unis;USD;AS");
			lesPays.Add("IQ;Iraq (l’);Bagdad;le dinar iraquien;IQD;AS");
			lesPays.Add("IR;Iran (l’);Téhéran;le rial iranien;IRR;AS");
			lesPays.Add("IS;Islande (l’);Reykjavik;la couronne islandaise;ISK;EU");
			lesPays.Add("IT;Italie (l’);Rome;l’euro;EUR;EU");
			lesPays.Add("JE;Jersey;Saint-Hélier;la livre de Jersey;JEP;EU");
			lesPays.Add("JM;Jamaïque (la);Kingston;le dollar jamaïcain;JMD;NA");
			lesPays.Add("JO;Jordanie (la);Amman;le dinar jordanien;JOD;AS");
			lesPays.Add("JP;Japon (le);Tokyo;le yen;JPY;AS");
			lesPays.Add("KE;Kenya (le);Nairobi;le shilling kényan;KES;AF");
			lesPays.Add("KG;Kirghizstan (le);Bichkek;le som;KGS;AS");
			lesPays.Add("KH;Cambodge (le);Phnom Penh;le riel;KHR;AS");
			lesPays.Add("KI;Kiribati;Tarawa;le dollar australien;AUD;OC");
			lesPays.Add("KM;Comores (les);Moroni;le franc comorien;KMF;AF");
			lesPays.Add("KN;Saint-Christophe-et-Niévès;Basseterre;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("KP;Corée du Nord (la);Pyongyang;le won nord-coréen;KPW;AS");
			lesPays.Add("KR;Corée du Sud (la);Séoul;le won sud-coréen;KRW;AS");
			lesPays.Add("KW;Koweït (le);Koweït;le dinar koweïtien;KWD;AS");
			lesPays.Add("KY;Îles Caïmans (les);George Town;le dollar des Îles Caïmans;KYD;NA");
			lesPays.Add("KZ;Kazakhstan (le);Nour-Soultan;le tenge;KZT;EU");
			lesPays.Add("LA;Laos (le);Vientiane;le kip;LAK;AS");
			lesPays.Add("LB;Liban (le);Beyrouth;la livre libanaise;LBP;AS");
			lesPays.Add("LC;Sainte-Lucie;Castries;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("LI;Liechtenstein (le);Vaduz;le franc suisse;CHF;EU");
			lesPays.Add("LK;Sri Lanka;Sri Jayawardenapura Kotte;la roupie sri-lankaise;LKR;AS");
			lesPays.Add("LR;Liberia (le);Monrovia;le dollar libérien;LRD;AF");
			lesPays.Add("LS;Lesotho (le);Maseru;le loti;LSL;AF");
			lesPays.Add("LT;Lituanie (la);Vilnius;l’euro;EUR;EU");
			lesPays.Add("LU;Luxembourg (le);Luxembourg;l’euro;EUR;EU");
			lesPays.Add("LV;Lettonie (la);Riga;l’euro;EUR;EU");
			lesPays.Add("LY;Libye (la);Tripoli;le dinar libyen;LYD;AF");
			lesPays.Add("MA;Maroc (le);Rabat;le dirham marocain;MAD;AF");
			lesPays.Add("MC;Monaco;Monaco;l’euro ;EUR;EU");
			lesPays.Add("MD;Moldavie (la);Chisinau;le leu moldave;MDL;EU");
			lesPays.Add("ME;Monténégro (le);Podgorica;l’euro ;EUR;EU");
			lesPays.Add("MG;Madagascar;Antananarivo;l’ariary;MGA;AF");
			lesPays.Add("MH;Îles Marshall (les);Majuro;le dollar des États-Unis;USD;OC");
			lesPays.Add("MK;Macédoine du Nord (la);Skopje;le denar;MKD;EU");
			lesPays.Add("ML;Mali (le);Bamako;le franc CFA;XOF;AF");
			lesPays.Add("MM;Myanmar (le)/Birmanie (la);Nay Pyi Daw;le kyat;MMK;AS");
			lesPays.Add("MN;Mongolie (la);Oulan-Bator;le tugrik;MNT;AS");
			lesPays.Add("MO;Macao;Macao;le pataca;MOP;AS");
			lesPays.Add("MP;Îles Mariannes du Nord (les);Saipan;le dollar des États-Unis;USD;OC");
			lesPays.Add("MQ;Martinique (la);Fort-de-France;l’euro;EUR;NA");
			lesPays.Add("MR;Mauritanie (la);Nouakchott;l’ouguiya;MRU;AF");
			lesPays.Add("MS;Montserrat;Plymouth;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("MT;Malte;La Valette;l’euro ;EUR;EU");
			lesPays.Add("MU;Maurice;Port-Louis;la roupie mauricienne;MUR;AF");
			lesPays.Add("MV;Maldives (les);Malé;le rufiyaa;MVR;AS");
			lesPays.Add("MW;Malawi (le);Lilongwe;le kwacha du Malawi;MWK;AF");
			lesPays.Add("MX;Mexique (le);Mexico;le peso mexicain;MXN;NA");
			lesPays.Add("MY;Malaisie (la);Kuala Lumpur;le ringgit;MYR;AS");
			lesPays.Add("MZ;Mozambique (le);Maputo;le metical;MZN;AF");
			lesPays.Add("NA;Namibie (la);Windhoek;le dollar namibien;NAD;AF");
			lesPays.Add("NC;Nouvelle-Calédonie (la);Nouméa;le franc CFP;XPF;OC");
			lesPays.Add("NE;Niger (le);Niamey;le franc CFA;XOF;AF");
			lesPays.Add("NF;Île Norfolk (l’);Kingston;le dollar australien;AUD;OC");
			lesPays.Add("NG;Nigeria (le);Abuja;le naira;NGN;AF");
			lesPays.Add("NI;Nicaragua (le);Managua;le córdoba oro;NIO;NA");
			lesPays.Add("NL;Pays-Bas (les);Amsterdam;l’euro ;EUR;EU");
			lesPays.Add("NO;Norvège (la);Oslo;la couronne norvégienne;NOK;EU");
			lesPays.Add("NP;Népal (le);Katmandou;la roupie népalaise;NPR;AS");
			lesPays.Add("NR;Nauru;Yaren;le dollar australien;AUD;OC");
			lesPays.Add("NU;Niue;Alofi;le dollar néo-zélandais;NZD;OC");
			lesPays.Add("NZ;Nouvelle-Zélande (la);Wellington;le dollar néo-zélandais;NZD;OC");
			lesPays.Add("OM;Oman;Mascate;le rial d’Oman;OMR;AS");
			lesPays.Add("PA;Panama (le);Panama;le balboa;PAB;NA");
			lesPays.Add("PE;Pérou (le);Lima;le sol;PEN;SA");
			lesPays.Add("PF;Polynésie française (la) ;Papeete;le franc CFP;XPF;OC");
			lesPays.Add("PG;Papouasie - Nouvelle-Guinée (la);Port Moresby;le kina;PGK;OC");
			lesPays.Add("PH;Philippines (les);Manille;le peso philippin;PHP;AS");
			lesPays.Add("PK;Pakistan (le);Islamabad;la roupie pakistanaise;PKR;AS");
			lesPays.Add("PL;Pologne (la);Varsovie;le zloty;PLN;EU");
			lesPays.Add("PM;Saint-Pierre-et-Miquelon;Saint-Pierre;l’euro ;EUR;NA");
			lesPays.Add("PN;Îles Pitcairn (les);Adamstown;le dollar néo-zélandais;NZD;OC");
			lesPays.Add("PR;Porto Rico;San Juan;le dollar des États-Unis;USD;NA");
			lesPays.Add("PT;Portugal (le);Lisbonne;l’euro ;EUR;EU");
			lesPays.Add("PW;Palaos (les);Melekeok;le dollar des États-Unis;USD;OC");
			lesPays.Add("PY;Paraguay (le);Asunción;le guarani;PYG;SA");
			lesPays.Add("QA;Qatar (le);Doha;le rial du Qatar;QAR;AS");
			lesPays.Add("RE;La Réunion;Saint-Denis;l’euro;EUR;AF");
			lesPays.Add("RO;Roumanie (la);Bucarest;le leu roumain;RON;EU");
			lesPays.Add("RS;Serbie (la);Belgrade;le dinar serbe;RSD;EU");
			lesPays.Add("RU;Russie (la);Moscou;le rouble russe;RUB;EU");
			lesPays.Add("RW;Rwanda (le);Kigali;le franc rwandais;RWF;AF");
			lesPays.Add("SA;Arabie saoudite (l’);Riyad;le riyal saoudien;SAR;AS");
			lesPays.Add("SB;Îles Salomon (les);Honiara;le dollar des Îles Salomon;SBD;OC");
			lesPays.Add("SC;Seychelles (les);Victoria;la roupie seychelloise;SCR;AF");
			lesPays.Add("SD;Soudan (le);Khartoum;la livre soudanaise;SDG;AF");
			lesPays.Add("SE;Suède (la);Stockholm;la couronne suédoise;SEK;EU");
			lesPays.Add("SG;Singapour;Singapour;le dollar de Singapour;SGD;AS");
			lesPays.Add("SH;Sainte-Hélène, Ascension et Tristan da Cunha;Jamestown;la livre de Sainte-Hélène (Sainte-Hélène et Ascension);SHP;AF");
			lesPays.Add("SI;Slovénie (la);Ljubljana;l’euro ;EUR;EU");
			lesPays.Add("SJ;Svalbard et Jan Mayen;Longyearbyen (Svalbard), Olonkinbyen (Jan Mayen);la couronne norvégienne;NOK;EU");
			lesPays.Add("SK;Slovaquie (la);Bratislava;l’euro ;EUR;EU");
			lesPays.Add("SL;Sierra Leone (la);Freetown;le leone;SLL;AF");
			lesPays.Add("SM;Saint-Marin;Saint-Marin;l’euro ;EUR;EU");
			lesPays.Add("SN;Sénégal (le);Dakar;le franc CFA;XOF;AF");
			lesPays.Add("SO;Somalie (la);Mogadiscio;le shilling somalien;SOS;AF");
			lesPays.Add("SR;Suriname (le);Paramaribo;le dollar surinamais;SRD;SA");
			lesPays.Add("SS;Soudan du Sud (le);Djouba;la livre sud-soudanaise;SSP;AF");
			lesPays.Add("ST;Sao Tomé-et-Principe;Sao Tomé;le dobra;STN;AF");
			lesPays.Add("SV;El Salvador (l’);San Salvador;le colon salvadorien;SVC;NA");
			lesPays.Add("SX;Sint-Maarten;Philipsburg;le florin des Antilles néerlandaises;ANG;NA");
			lesPays.Add("SY;Syrie (la);Damas;la livre syrienne;SYP;AS");
			lesPays.Add("SZ;Eswatini (l’);Mbabane;le lilangeni (pl.: emalangeni);SZL;AF");
			lesPays.Add("TC;Îles Turks-et-Caïcos (les);Cockburn Town;le dollar des États-Unis;USD;NA");
			lesPays.Add("TD;Tchad (le);N’Djamena;le franc CFA;XAF;AF");
			lesPays.Add("TF;Terres australes et antarctiques françaises (les);non renseigné;l’euro ;EUR;AN");
			lesPays.Add("TG;Togo (le);Lomé;le franc CFA;XOF;AF");
			lesPays.Add("TH;Thaïlande (la);Bangkok;le baht;THB;AS");
			lesPays.Add("TJ;Tadjikistan (le);Douchanbé;le somoni;TJS;AS");
			lesPays.Add("TK;Tokélaou (les);Atafu - Nukunonu - Fakaofo;le dollar néo-zélandais;NZD;OC");
			lesPays.Add("TL;Timor-Oriental (le);Díli;le dollar des États-Unis;USD;AS");
			lesPays.Add("TM;Turkménistan (le);Achgabat;le manat turkmène;TMT;AS");
			lesPays.Add("TN;Tunisie (la);Tunis;le dinar tunisien;TND;AF");
			lesPays.Add("TO;Tonga (les);Nuku’alofa;le pa’anga;TOP;OC");
			lesPays.Add("TR;Turquie (la);Ankara;la livre turque;TRY;EU");
			lesPays.Add("TT;Trinité-et-Tobago;Port of Spain;le dollar de Trinité-et-Tobago;TTD;NA");
			lesPays.Add("TV;Tuvalu (les);Funafuti;le dollar australien;AUD;OC");
			lesPays.Add("TW;Taïwan;Taipei;le nouveau dollar de Taïwan;TWD;AS");
			lesPays.Add("TZ;Tanzanie (la);Dodoma;le shilling tanzanien;TZS;AF");
			lesPays.Add("UA;Ukraine (l’);Kiev;la hryvnia;UAH;EU");
			lesPays.Add("UK;Royaume-Uni (le);Londres;la livre sterling;GBP;EU");
			lesPays.Add("UM;Îles mineures éloignées des États-Unis (les);non renseigné;le dollar des États-Unis;USD;OC");
			lesPays.Add("US;États-Unis (les);Washington;le dollar des États-Unis;USD;NA");
			lesPays.Add("UY;Uruguay (l’);Montevideo;le peso uruguayen;UYU;SA");
			lesPays.Add("UZ;Ouzbékistan (l’);Tachkent;le sum;UZS;AS");
			lesPays.Add("VA;Saint-Siège (le)/État de la Cité du Vatican (l’);Cité du Vatican;l’euro ;EUR;EU");
			lesPays.Add("VC;Saint-Vincent-et-les-Grenadines;Kingstown;le dollar des Caraïbes orientales;XCD;NA");
			lesPays.Add("VE;Venezuela (le);Caracas;le bolivar souverain;VES;SA");
			lesPays.Add("VG;Îles Vierges britanniques (les);Road Town;le dollar des États-Unis;USD;NA");
			lesPays.Add("VI;Îles Vierges américaines (les);Charlotte Amalie;le dollar des États-Unis;USD;NA");
			lesPays.Add("VN;Viêt Nam (le);Hanoï;le dông;VND;AS");
			lesPays.Add("VU;Vanuatu (le);Port Vila;le vatu;VUV;OC");
			lesPays.Add("WF;Wallis-et-Futuna;Mata-Utu;le franc CFP;XPF;OC");
			lesPays.Add("WS;Samoa (le);Apia;le tala;WST;OC");
			lesPays.Add("YE;Yémen (le);Sanaa;le riyal yéménite;YER;AS");
			lesPays.Add("YT;Mayotte;Mamoudzou;l’euro ;EUR;AF");
			lesPays.Add("ZA;Afrique du Sud (l’);Pretoria;le rand;ZAR;AF");
			lesPays.Add("ZM;Zambie (la);Lusaka;le kwacha de Zambie;ZMW;AF");
			lesPays.Add("ZW;Zimbabwe (le);Harare;le dollar zimbabwéen;ZWL;AF");
		}

		private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
		{
			int index;
			String[] pays;

			index = lstPays.SelectedIndex;

			pays = laSelection[index].Split(';');
			lblNomPays.Text = pays[1];
			lblCapitale.Text = pays[2];
			lblMonnaie.Text = pays[3];

			try
			{
				imgDrapeau.Image = Image.FromFile("Images\\" + pays[0] + ".png");

			}
			catch (Exception ex)
			{
				imgDrapeau.Image = Image.FromFile("Images\\sans.png");
			}
		}

		private void radioAfrique_CheckedChanged(object sender, EventArgs e)
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');
				// Ajout des pays africains
				if (temp[5].Equals("AF"))
				{
					lstPays.Items.Add(temp[1]);
					laSelection.Add(s);
				}
			}
		}

		private void radioAmeriqueDuNord_CheckedChanged(object sender, EventArgs e)
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();
			laSelection.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');
				// Ajout des pays d'Amérique du Nord
				if (temp[5].Equals("NA"))
				{
					lstPays.Items.Add(temp[1]);
					laSelection.Add(s);
				}
			}
		}

		private void radioAmeriqueDuSud_CheckedChanged(object sender, EventArgs e)
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();
			laSelection.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');
				// Ajout des pays d'amérique du sud
				if (temp[5].Equals("SA"))
				{
					lstPays.Items.Add(temp[1]);
					laSelection.Add(s);
				}
			}
		}

		private void radioAntarctique_CheckedChanged(object sender, EventArgs e)
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();
			laSelection.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');
				// Ajout des pays d'antarctique
				if (temp[5].Equals("AN"))
				{
					lstPays.Items.Add(temp[1]);
					laSelection.Add(s);
				}
			}
		}

		private void radioAsie_CheckedChanged(object sender, EventArgs e)
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();
			laSelection.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');
				// Ajout des pays asiatiques
				if (temp[5].Equals("AS"))
				{
					lstPays.Items.Add(temp[1]);
					laSelection.Add(s);
				}
			}
		}

		private void radioEurope_CheckedChanged(object sender, EventArgs e)
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();
			laSelection.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');
				// Ajout des pays européens
				if (temp[5].Equals("EU"))
				{
					lstPays.Items.Add(temp[1]);
					laSelection.Add(s);
				}
			}
		}

		private void radioOceanie_CheckedChanged(object sender, EventArgs e)
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();
			laSelection.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');
				// Ajout des pays européens
				if (temp[5].Equals("OC"))
				{
					lstPays.Items.Add(temp[1]);
					laSelection.Add(s);
				}
			}
		}

		private void radioTous_CheckedChanged_1(object sender, EventArgs e)
		{
			chargerTout();
		}


		private void chargerTout()
		{
			String[] temp;

			// Vidage de la liste
			lstPays.Items.Clear();
			laSelection.Clear();

			// Parcours de la liste des pays
			foreach (String s in lesPays)
			{
				// Récupération des informations
				temp = s.Split(';');

				// Ajout de tous les pays
				lstPays.Items.Add(temp[1]);
				laSelection.Add(s);
			}
		}
	}
}
