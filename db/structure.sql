
CREATE SEQUENCE public.image_image_id_seq;

CREATE TABLE public.image (
                image_id INTEGER NOT NULL DEFAULT nextval('public.image_image_id_seq'),
                alt VARCHAR NOT NULL,
                path VARCHAR NOT NULL,
                title VARCHAR NOT NULL,
                CONSTRAINT image_pk PRIMARY KEY (image_id)
);


ALTER SEQUENCE public.image_image_id_seq OWNED BY public.image.image_id;

CREATE SEQUENCE public.magazine_item_id_seq;

CREATE TABLE public.magazine (
                item_id INTEGER NOT NULL DEFAULT nextval('public.magazine_item_id_seq'),
                editionNumber INTEGER,
                name VARCHAR NOT NULL,
                publishDate DATE,
                itemRef VARCHAR NOT NULL,
                totalCount INTEGER NOT NULL,
                remainingCount INTEGER NOT NULL,
                alley VARCHAR NOT NULL,
                place VARCHAR NOT NULL,
                image_id INTEGER,
                CONSTRAINT magazine_pk PRIMARY KEY (item_id)
);


ALTER SEQUENCE public.magazine_item_id_seq OWNED BY public.magazine.item_id;

CREATE SEQUENCE public.citizenship_citizenship_id_seq;

CREATE TABLE public.citizenship (
                citizenship_id INTEGER NOT NULL DEFAULT nextval('public.citizenship_citizenship_id_seq'),
                countryName VARCHAR NOT NULL,
                CONSTRAINT citizenship_pk PRIMARY KEY (citizenship_id)
);


ALTER SEQUENCE public.citizenship_citizenship_id_seq OWNED BY public.citizenship.citizenship_id;

CREATE SEQUENCE public.user_account_user_id_seq;

CREATE TABLE public.user_account (
                user_id INTEGER NOT NULL DEFAULT nextval('public.user_account_user_id_seq'),
                email VARCHAR NOT NULL,
                password VARCHAR NOT NULL,
                firstname VARCHAR NOT NULL,
                lastname VARCHAR NOT NULL,
                address VARCHAR NOT NULL,
                postCode VARCHAR NOT NULL,
                phoneNumber VARCHAR NOT NULL,
                citizenship_id INTEGER NOT NULL,
                role VARCHAR NOT NULL,
                CONSTRAINT user_account_pk PRIMARY KEY (user_id)
);


ALTER SEQUENCE public.user_account_user_id_seq OWNED BY public.user_account.user_id;

CREATE UNIQUE INDEX user_idx
 ON public.user_account
 ( email );

CREATE SEQUENCE public.borrow_borrow_id_seq;

CREATE TABLE public.borrow (
                borrow_id INTEGER NOT NULL DEFAULT nextval('public.borrow_borrow_id_seq'),
                StartDate DATE NOT NULL,
                getBackDate DATE,
                extended BOOLEAN NOT NULL,
                user_id INTEGER NOT NULL,
                item_id INTEGER NOT NULL,
                CONSTRAINT borrow_pk PRIMARY KEY (borrow_id)
);


ALTER SEQUENCE public.borrow_borrow_id_seq OWNED BY public.borrow.borrow_id;

CREATE SEQUENCE public.author_author_id_seq;

CREATE TABLE public.author (
                author_id INTEGER NOT NULL DEFAULT nextval('public.author_author_id_seq'),
                name VARCHAR NOT NULL,
                firstname VARCHAR NOT NULL,
                birth INTEGER NOT NULL,
                death INTEGER,
                biography VARCHAR,
                image_id INTEGER,
                CONSTRAINT author_pk PRIMARY KEY (author_id)
);


ALTER SEQUENCE public.author_author_id_seq OWNED BY public.author.author_id;

CREATE TABLE public.author_citizenship (
                citizenship_id INTEGER NOT NULL,
                author_id INTEGER NOT NULL,
                CONSTRAINT author_citizenship_pk PRIMARY KEY (citizenship_id, author_id)
);


CREATE SEQUENCE public.book_item_id_seq;

CREATE TABLE public.book (
                item_id INTEGER NOT NULL DEFAULT nextval('public.book_item_id_seq'),
                title VARCHAR NOT NULL,
                language VARCHAR NOT NULL,
                release DATE NOT NULL,
                summary VARCHAR,
                editor VARCHAR NOT NULL,
                itemRef VARCHAR NOT NULL,
                totalCount INTEGER NOT NULL,
                remainingCount INTEGER NOT NULL,
                alley VARCHAR NOT NULL,
                place VARCHAR NOT NULL,
                image_id INTEGER,
                CONSTRAINT book_pk PRIMARY KEY (item_id)
);


ALTER SEQUENCE public.book_item_id_seq OWNED BY public.book.item_id;

CREATE TABLE public.author_book (
                author_id INTEGER NOT NULL,
                item_id INTEGER NOT NULL,
                CONSTRAINT author_book_pk PRIMARY KEY (author_id, item_id)
);


ALTER TABLE public.book ADD CONSTRAINT image_book_fk
FOREIGN KEY (image_id)
REFERENCES public.image (image_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.magazine ADD CONSTRAINT image_magazine_fk
FOREIGN KEY (image_id)
REFERENCES public.image (image_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.author ADD CONSTRAINT image_author_fk
FOREIGN KEY (image_id)
REFERENCES public.image (image_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.user_account ADD CONSTRAINT citizenship_user_fk
FOREIGN KEY (citizenship_id)
REFERENCES public.citizenship (citizenship_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.author_citizenship ADD CONSTRAINT citizenship_author_citizenship_fk
FOREIGN KEY (citizenship_id)
REFERENCES public.citizenship (citizenship_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.borrow ADD CONSTRAINT user_borrow_fk
FOREIGN KEY (user_id)
REFERENCES public.user_account (user_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.author_citizenship ADD CONSTRAINT author_author_citizenship_fk
FOREIGN KEY (author_id)
REFERENCES public.author (author_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.author_book ADD CONSTRAINT author_author_book_fk
FOREIGN KEY (author_id)
REFERENCES public.author (author_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.author_book ADD CONSTRAINT book_author_book_fk
FOREIGN KEY (item_id)
REFERENCES public.book (item_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;