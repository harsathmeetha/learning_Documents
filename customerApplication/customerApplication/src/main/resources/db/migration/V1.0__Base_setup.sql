--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12.1

-- Started on 2020-01-29 14:50:58

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 32822)
-- Name: customers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.customers (
    "customerId" integer NOT NULL,
    "firstName" character varying,
    "lastName" character varying,
    "phoneNumber" bigint,
    location character varying,
    zipcode integer
);


ALTER TABLE public.customers OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 32820)
-- Name: customers_customerId_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."customers_customerId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."customers_customerId_seq" OWNER TO postgres;

--
-- TOC entry 2849 (class 0 OID 0)
-- Dependencies: 202
-- Name: customers_customerId_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."customers_customerId_seq" OWNED BY public.customers."customerId";


--
-- TOC entry 205 (class 1259 OID 32833)
-- Name: orders; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.orders (
    "orderId" integer NOT NULL,
    "orderStatus" character varying,
    products character varying
);


ALTER TABLE public.orders OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 32831)
-- Name: orders_orderId_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."orders_orderId_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."orders_orderId_seq" OWNER TO postgres;

--
-- TOC entry 2850 (class 0 OID 0)
-- Dependencies: 204
-- Name: orders_orderId_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."orders_orderId_seq" OWNED BY public.orders."orderId";


--
-- TOC entry 207 (class 1259 OID 32948)
-- Name: user_details; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.user_details (
    id integer NOT NULL,
    cus_id integer NOT NULL,
    ord_id integer NOT NULL
);


ALTER TABLE public.user_details OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 32946)
-- Name: user_details_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.user_details_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.user_details_id_seq OWNER TO postgres;

--
-- TOC entry 2851 (class 0 OID 0)
-- Dependencies: 206
-- Name: user_details_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.user_details_id_seq OWNED BY public.user_details.id;


--
-- TOC entry 2701 (class 2604 OID 32825)
-- Name: customers customerId; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customers ALTER COLUMN "customerId" SET DEFAULT nextval('public."customers_customerId_seq"'::regclass);


--
-- TOC entry 2702 (class 2604 OID 32836)
-- Name: orders orderId; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders ALTER COLUMN "orderId" SET DEFAULT nextval('public."orders_orderId_seq"'::regclass);


--
-- TOC entry 2703 (class 2604 OID 32951)
-- Name: user_details id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_details ALTER COLUMN id SET DEFAULT nextval('public.user_details_id_seq'::regclass);


--
-- TOC entry 2839 (class 0 OID 32822)
-- Dependencies: 203
-- Data for Name: customers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.customers ("customerId", "firstName", "lastName", "phoneNumber", location, zipcode) FROM stdin;
\.


--
-- TOC entry 2841 (class 0 OID 32833)
-- Dependencies: 205
-- Data for Name: orders; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.orders ("orderId", "orderStatus", products) FROM stdin;
\.


--
-- TOC entry 2843 (class 0 OID 32948)
-- Dependencies: 207
-- Data for Name: user_details; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.user_details (id, cus_id, ord_id) FROM stdin;
\.


--
-- TOC entry 2852 (class 0 OID 0)
-- Dependencies: 202
-- Name: customers_customerId_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."customers_customerId_seq"', 1, false);


--
-- TOC entry 2853 (class 0 OID 0)
-- Dependencies: 204
-- Name: orders_orderId_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."orders_orderId_seq"', 1, false);


--
-- TOC entry 2854 (class 0 OID 0)
-- Dependencies: 206
-- Name: user_details_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user_details_id_seq', 1, false);


--
-- TOC entry 2705 (class 2606 OID 32830)
-- Name: customers customers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_pkey PRIMARY KEY ("customerId");


--
-- TOC entry 2707 (class 2606 OID 32841)
-- Name: orders orders_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY ("orderId");


--
-- TOC entry 2709 (class 2606 OID 32953)
-- Name: user_details user_details_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_details
    ADD CONSTRAINT user_details_pkey PRIMARY KEY (id);


--
-- TOC entry 2710 (class 2606 OID 32954)
-- Name: user_details cus_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_details
    ADD CONSTRAINT cus_id_fk FOREIGN KEY (cus_id) REFERENCES public.customers("customerId");


--
-- TOC entry 2711 (class 2606 OID 32959)
-- Name: user_details ord_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.user_details
    ADD CONSTRAINT ord_id_fk FOREIGN KEY (ord_id) REFERENCES public.orders("orderId");


-- Completed on 2020-01-29 14:50:59

--
-- PostgreSQL database dump complete
--

