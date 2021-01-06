package acronym;

abstract class Words {
  public static final String[] words = { "a", "abbandonare", "abbastanza", "abitare", "abito", "accadere", "accanto",
      "accendere", "accettare", "accogliere", "accompagnare", "accordo", "accorgersi", "acqua", "addirittura",
      "addosso", "adesso", "affare", "affatto", "affermare", "affrontare", "aggiungere", "ah", "aiutare", "aiuto",
      "albergo", "albero", "alcuno", "allontanare", "allora", "almeno", "alto", "altro", "alzare", "amare", "ambiente",
      "americano", "amico", "ammazzare", "ammettere", "amore", "ampio", "anche", "ancora", "andare", "angolo", "anima",
      "animale", "animo", "anno", "annunciare", "antico", "anzi", "apparire", "appartenere", "appena", "appoggiare",
      "appunto", "aprire", "argomento", "aria", "arma", "armare", "arrestare", "arrivare", "arte", "articolo",
      "ascoltare", "aspettare", "aspetto", "assai", "assicurare", "assistere", "assoluto", "assumere", "attaccare",
      "atteggiamento", "attendere", "attento", "attenzione", "attesa", "attimo", "attività", "atto", "attore",
      "attorno", "attraversare", "attuale", "aumentare", "automobile", "autore", "autorità", "avanti", "avanzare",
      "avere", "avvenire", "avvertire", "avvicinare", "avvocato", "azione", "azzurro", "baciare", "badare", "bagno",
      "bambina", "bambino", "base", "basso", "bastare", "battaglia", "battere", "bellezza", "bello", "bene", "bere",
      "bestia", "bianco", "biondo", "bisognare", "bisogno", "bocca", "bosco", "braccio", "bravo", "breve", "bruciare",
      "brutto", "buio", "buono", "buttare", "cadere", "caffè", "calcio", "caldo", "cambiare", "camera", "camminare",
      "campagna", "campo", "cane", "cantare", "capace", "capello", "capire", "capitare", "capo", "carattere",
      "caratteristico", "carne", "caro", "carta", "casa", "caso", "cattivo", "cattolico", "causa", "cavallo",
      "celebrare", "centrale", "centro", "cercare", "certamente", "certo", "che", "chi", "chiamare", "chiaro", "chiave",
      "chiedere", "chiesa", "chilometro", "chissà", "chiudere", "ci", "ciascuno", "cielo", "cioè", "circa", "cittadino",
      "città", "civile", "civiltà", "ciò", "classe", "collina", "collo", "colore", "coloro", "colpa", "colpire",
      "colpo", "come", "cominciare", "commercio", "commissione", "comodo", "compagnia", "compagno", "compiere",
      "completamente", "comporre", "comprare", "comprendere", "comune", "comunicazione", "comunque", "con", "concedere",
      "concetto", "concludere", "condizione", "condurre", "confessare", "confronto", "congresso", "conoscenza",
      "conoscere", "conseguenza", "consentire", "conservare", "considerare", "consiglio", "contadino", "contare",
      "contatto", "contenere", "contento", "continuare", "continuo", "conto", "contrario", "contro", "controllo",
      "convincere", "coprire", "coraggio", "corpo", "corrente", "correre", "corsa", "corso", "cortile", "cosa",
      "coscienza", "costa", "costituire", "costringere", "costruire", "costruzione", "creare", "credere", "crescere",
      "crisi", "cristiano", "croce", "cucina", "cui", "cultura", "cuore", "cura", "da", "dare", "davanti", "davvero",
      "decidere", "decisione", "dedicare", "denaro", "dente", "dentro", "descrivere", "desiderare", "desiderio",
      "destino", "destro", "determinare", "di", "dichiarare", "dietro", "difendere", "difesa", "differenza",
      "difficile", "difficoltà", "diffondere", "dimenticare", "dimostrare", "dinanzi", "dio", "dipendere", "dire",
      "diretto", "direttore", "direzione", "dirigere", "diritto", "discorso", "discutere", "disporre", "disposizione",
      "distanza", "distinguere", "distruggere", "dito", "divenire", "diventare", "diverso", "divertire", "dividere",
      "dolce", "dolore", "domanda", "domandare", "domani", "domenica", "don", "donna", "dopo", "dormire", "dottore",
      "dove", "dovere", "dubbio", "dunque", "durante", "durare", "duro", "e", "eccellenza", "eccetera", "ecco",
      "economico", "effetto", "egli", "eh", "elemento", "elettrico", "elevare", "energia", "enorme", "entrare", "entro",
      "epoca", "eppure", "erba", "errore", "esame", "escludere", "esempio", "esercito", "esistere", "esperienza",
      "esporre", "espressione", "esprimere", "essa", "essere", "esso", "estate", "estendere", "estero", "estremo",
      "età", "europeo", "evitare", "fabbrica", "faccia", "facile", "fame", "famiglia", "famoso", "fantasia", "fatica",
      "fatto", "favore", "fede", "felice", "fenomeno", "ferire", "fermare", "fermo", "ferro", "festa", "fianco",
      "fiducia", "figlia", "figlio", "figura", "figurare", "film", "filo", "finalmente", "finché", "fine", "finestra",
      "finire", "fino", "fiore", "fissare", "fiume", "foglia", "folla", "fondare", "fondo", "forma", "formare",
      "fornire", "forse", "forte", "fortuna", "forza", "fra", "francese", "frase", "fratello", "freddo", "fresco",
      "fretta", "fronte", "frutto", "fuggire", "fumare", "funzione", "fuoco", "fuori", "futuro", "gamba", "gatto",
      "generale", "genere", "gente", "gesto", "gettare", "giallo", "giardino", "giocare", "gioco", "gioia", "giornale",
      "giornata", "giorno", "giovane", "giovanotto", "girare", "giro", "giudicare", "giudizio", "giugno", "giungere",
      "giustizia", "giusto", "già", "giù", "godere", "governo", "grado", "grande", "grave", "grazia", "grazie", "greco",
      "gridare", "grigio", "grosso", "gruppo", "guardare", "guardia", "guerra", "guidare", "gusto", "idea", "ieri",
      "il", "immaginare", "immagine", "imparare", "impedire", "imporre", "importante", "importanza", "importare",
      "impossibile", "impressione", "improvviso", "in", "incontrare", "indicare", "indietro", "industria",
      "industriale", "infatti", "infine", "inglese", "iniziare", "inizio", "innamorare", "inoltre", "insegnare",
      "insieme", "insistere", "insomma", "intanto", "intendere", "intenzione", "interessante", "interessare",
      "interesse", "internazionale", "interno", "intero", "intorno", "inutile", "invece", "inverno", "invitare", "io",
      "isola", "istante", "istituto", "italiano", "labbro", "lago", "lanciare", "largo", "lasciare", "latino", "lato",
      "latte", "lavorare", "lavoro", "legare", "legge", "leggere", "leggero", "lei", "lettera", "letto", "levare", "li",
      "liberare", "libero", "libertà", "libro", "limitare", "limite", "linea", "lingua", "lira", "lo", "lontano",
      "loro", "lotta", "luce", "lui", "luna", "lungo", "luogo", "là", "lì", "ma", "macchina", "madre", "maestro",
      "magari", "maggio", "maggiore", "malattia", "male", "mamma", "mancare", "mandare", "mangiare", "maniera", "mano",
      "mantenere", "mare", "marito", "massa", "massimo", "materia", "matrimonio", "mattina", "mattino", "medesimo",
      "medico", "medio", "meglio", "memoria", "meno", "mente", "mentre", "mercato", "meritare", "merito", "mese",
      "messa", "mestiere", "metro", "mettere", "metà", "mezzo", "mi", "migliore", "milione", "militare", "minimo",
      "ministro", "minore", "minuto", "mio", "misura", "moderno", "modo", "moglie", "molto", "momento", "mondo",
      "montagna", "monte", "morale", "morire", "morte", "mostrare", "motivo", "movimento", "muovere", "muro", "musica",
      "nascere", "nascondere", "natura", "naturale", "naturalmente", "nave", "nazionale", "nazione", "ne", "neanche",
      "necessario", "necessità", "nemico", "nemmeno", "neppure", "nero", "nessuno", "niente", "no", "nobile", "noi",
      "nome", "non", "nord", "normale", "nostro", "notare", "notevole", "notizia", "noto", "notte", "nudo", "nulla",
      "numero", "numeroso", "nuovo", "né", "o", "occasione", "occhio", "occorrere", "odore", "offendere", "offrire",
      "oggetto", "oggi", "ogni", "ognuno", "oh", "oltre", "ombra", "onore", "opera", "operaio", "operazione",
      "opinione", "opporre", "oppure", "ora", "oramai", "ordinare", "ordine", "orecchio", "organizzare", "origine",
      "oro", "ospedale", "osservare", "ottenere", "pace", "padre", "padrone", "paese", "pagare", "pagina", "palazzo",
      "pane", "papà", "parecchio", "parere", "parete", "parlare", "parola", "parte", "partecipare", "particolare",
      "partire", "partito", "passare", "passato", "passione", "passo", "patria", "paura", "pazzo", "peccato", "peggio",
      "pelle", "pena", "pensare", "pensiero", "per", "perché", "perciò", "perdere", "perfetto", "perfino", "pericolo",
      "pericoloso", "periodo", "permettere", "persona", "personaggio", "personale", "però", "pesare", "peso", "pezzo",
      "piacere", "piangere", "piano", "pianta", "piantare", "pianura", "piazza", "piccolo", "piede", "pieno", "pietra",
      "pietà", "piuttosto", "più", "poco", "poesia", "poeta", "poiché", "politica", "politico", "polizia", "pomeriggio",
      "ponte", "popolazione", "popolo", "porre", "porta", "portare", "porto", "posare", "posizione", "possedere",
      "possibile", "possibilità", "posto", "potenza", "potere", "povero", "pranzo", "prato", "preciso", "preferire",
      "pregare", "prendere", "preoccupare", "preparare", "presentare", "presente", "presenza", "presidente", "presso",
      "presto", "prevedere", "prezzo", "prima", "primo", "principale", "principe", "principio", "privato",
      "probabilmente", "problema", "procedere", "processo", "prodotto", "produrre", "produzione", "professore",
      "profondo", "programma", "promettere", "pronto", "proporre", "proposito", "proposta", "proprio", "prossimo",
      "prova", "provare", "provincia", "provocare", "provvedere", "pubblicare", "pubblico", "punta", "punto", "pure",
      "puro", "qua", "quadro", "qualche", "qualcosa", "qualcuno", "quale", "qualità", "qualsiasi", "qualunque",
      "quanto", "quarto", "quasi", "quello", "questione", "questo", "qui", "quindi", "raccogliere", "raccontare",
      "ragazza", "ragazzo", "raggiungere", "ragione", "rapido", "rapporto", "rappresentare", "reale", "realtà",
      "recare", "recente", "regione", "regno", "relazione", "religioso", "rendere", "repubblica", "resistere",
      "restare", "resto", "ricchezza", "ricco", "ricerca", "ricevere", "richiedere", "riconoscere", "ricordare",
      "ricordo", "ridere", "ridurre", "riempire", "rientrare", "riferire", "rifiutare", "riguardare", "rimanere",
      "rimettere", "ringraziare", "ripetere", "riportare", "riprendere", "risolvere", "rispetto", "rispondere",
      "risposta", "risultare", "risultato", "ritenere", "ritornare", "ritorno", "ritrovare", "riunire", "riuscire",
      "riva", "rivedere", "rivelare", "rivolgere", "rivoluzione", "roba", "romano", "rompere", "rosso", "russo",
      "sacrificio", "sacro", "sala", "salire", "saltare", "salutare", "salvare", "sangue", "sapere", "sbagliare",
      "scala", "scappare", "scegliere", "scena", "scendere", "scherzare", "scienza", "scomparire", "scopo", "scoppiare",
      "scoprire", "scorrere", "scrittore", "scrivere", "scuola", "scusare", "se", "secolo", "secondo", "sede", "sedere",
      "segnare", "segno", "segretario", "segreto", "seguire", "seguito", "sembrare", "semplice", "senso", "sentimento",
      "sentire", "senza", "sera", "sereno", "serie", "serio", "servire", "servizio", "settimana", "sforzo", "sguardo",
      "si", "sicurezza", "sicuro", "significare", "signora", "signore", "signorina", "silenzio", "simile", "sinistro",
      "sino", "sistema", "situazione", "smettere", "sociale", "società", "soffrire", "sognare", "sogno", "soldato",
      "sole", "solito", "solo", "soltanto", "soluzione", "sonno", "sopra", "soprattutto", "sorella", "sorgere",
      "sorprendere", "sorridere", "sorriso", "sostenere", "sottile", "sotto", "spalla", "spazio", "speciale", "specie",
      "spegnere", "speranza", "sperare", "spesa", "spesso", "spettacolo", "spiegare", "spingere", "spirito", "sposare",
      "stabilire", "staccare", "stagione", "stamattina", "stampa", "stanco", "stanza", "stare", "stasera", "stato",
      "stazione", "stella", "stesso", "storia", "storico", "strada", "straniero", "strano", "straordinario",
      "stringere", "strumento", "studiare", "studio", "stupido", "su", "subito", "succedere", "successo", "sud", "suo",
      "suonare", "superare", "superiore", "svegliare", "sviluppo", "svolgere", "sì", "tacere", "tagliare", "tale",
      "tanto", "tardi", "tavola", "tavolo", "teatro", "tecnico", "tedesco", "temere", "tempo", "tendere", "tenere",
      "tentare", "termine", "terreno", "territorio", "terzo", "testa", "tipo", "tirare", "titolo", "toccare",
      "togliere", "tono", "tornare", "tra", "tranquillo", "trarre", "trascinare", "trasformare", "trattare", "tratto",
      "treno", "triste", "troppo", "trovare", "tu", "tuo", "tuttavia", "tutto", "uccidere", "udire", "ufficiale",
      "ufficio", "uguale", "ultimo", "umano", "un", "unico", "unire", "università", "uno", "uomo", "usare", "uscire",
      "uso", "utile", "valere", "valle", "valore", "vario", "vasto", "vecchio", "vedere", "vendere", "venire", "vento",
      "veramente", "verde", "verità", "vero", "verso", "vestire", "vestito", "vi", "via", "viaggio", "vicino", "villa",
      "vincere", "vino", "visita", "viso", "vista", "vita", "vivere", "vivo", "voce", "voglia", "voi", "volare",
      "volere", "volgere", "volontà", "volta", "voltare", "volto", "vostro", "vuoto", "zia", "zio", "zitto", "zona", };
}
