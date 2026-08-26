# Qubu.ai

> Qubu is a Russian AI/ML platform: models, datasets, laptops, courses and collaborative research.

## Core sections

- [Models](https://qubu.ai/models): catalogue of ML models - architectures, metrics, weights, inference options. Supports modelling comparison and semantic search.

- [Datasets](https://qubu.ai/datasets): datasets for training and validation - structured and unstructured, with descriptions of schemes and previews.

- [Notebooks](https://qubu.ai/notebooks): interactive Jupyter laptops with joint editing via Yjs and launch via Gradio.

- [Learning](https://qubu.ai/learning): courses and training materials on ML/AI - video lectures, assignments, certificates.

- [Journal](https://qubu.ai/journal): research articles, technical reviews and platform news.

- [Forum](https://qubu.ai/forum): discussions, Q&A and threads on ML, AI and Qubu platform.

- [Events](https://qubu.ai/events): conferences, meetups and online broadcasts from the world of AI/ML.

- [AI Solutions](https://qubu.ai/ai-solutions): ready-made AI solutions for business - a catalogue with categories and cases.

- [Streams](https://qubu.ai/streams): live broadcasts and recordings from the AI/ML area.

- [Private Clubs](https://qubu.ai/private-clubs): closed communities for joint research and projects.

## Glossary

Model: ML model published on the platform. Contains metadata, quality metrics, architecture description and inference options.

Dataset: a marked or unlagged data set for model training/validation. It has a scheme, keywords and a license.

Notebook: Jupyter laptop with the ability to edit and run in the cloud together.

Course: a structured curriculum of modules and tasks with progress tracking.

Journal post (Article): research or review publication in Markdown format with LaTeX support.

Forum thread: public discussion with attached comments and voting.

AI Solution: a ready-made AI-based business application, described with cases and prices.

Event: conference, meetup or webinar - online or offline.

Private Club: a closed community with access control for collaborative research.

Embedding: vector representation of a text or object for semantic search.

Inference: launching a model to get predictions - via Gradio or a built-in playground.

Token: a unit of internal currency of the platform used to pay for infence and other paid transactions.

## Public API endpoints

[Basic URL:]( https://qubu.ai/d369192cb0dc2c4fbba6c17d153fbaeb5056a9c1)
```env.ini
GET /api/models — list of models with filtering and pagination

GET /api/models/{id_or_slug} — details of a specific model

GET /api/datasets — list of datasets

GET /api/datasets/{id_or_slug} — dataset details

GET /api/notebooks — a list of laptops

GET /api/notebooks/{id_or_slug} — laptop details

GET /api/search/global — full-text search on the platform

GET /api/search/suggestions — search tips

GET /api/journal — list of journal articles

GET /api/forum — list of forum threads

GET /api/learning — list of courses

GET /api/events — list of events

GET /api/ai-solutions — list of AI solutions

GET /api/similarity - search for similar entities (semantic)

POST /api/embeddings - embedding generation (TBD: endpoint in development, will be paid)

GET /api/health — health-check of platform services

Closed groups (not for external agents): /api/admin/*, /api/auth/*, /api/maintenance-info/*, /api/inference/*, /api/internal/*
```
## Content formats

Markdown is the main content format for articles, model descriptions and datasets.

```mkdn
:::Tldr - summary block (TBD: renderer in development, Wave 2 §3.3b).

:::Faq is a block of frequently asked questions with support for FAQPage JSON-LD (TBD: §3.3b).

LaTeX - support for mathematical formulas within Markdown via KaTeX.

Mermaid — diagrams inside Markdown content.
```
## Legal

- [Terms of Service](https://qubu.ai/terms)

- Privacy policy: to be specified - the /privacy page is under development.

## For AI agents

- [Short LLM context](https://qubu.ai/llms.txt)

- [OpenAPI 3.1 spec](https://qubu.ai/api/openapi.json)

- [Interactive API docs](https://qubu.ai/api-docs)

- [MCP server manifest](https://qubu.ai/.well-known/mcp.json)

- [Legacy ChatGPT plugin manifest](https://qubu.ai/.well-known/ai-plugin.json)

- [Sitemap](https://qubu.ai/sitemap.xml)

- [Robots](https://qubu.ai/robots.txt)
